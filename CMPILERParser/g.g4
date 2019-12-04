grammar g;

program: globaldelcaration* function* main function* EOF;

//function declaration
main: MAIN block;
function: FUNCTION ((op=(INTEGER | FLOATING_POINT | CHARACTER | STRING) identifier functionparameters functionreturnblock) | (op=VOID identifier functionparameters functionvoidblock));
functionvoidblock: LBRACE statement* RBRACE;
functionreturnblock: LBRACE statement* returnstatement RBRACE;
functionparameters: LPARENTHESIS (declaration (COMMA declaration)*)? RPARENTHESIS;
call: CALL identifier LPARENTHESIS (callparameter (COMMA callparameter)*)? RPARENTHESIS;
callparameter: identifier|opr;
returnstatement: RETURN (identifier|charliteral|stringliteral|opr) SEMICOLON;

//type declaration
globaldelcaration: GLOBAL declaration SEMICOLON;
declaration: singledeclaration | arraydeclaration;
singledeclaration: intdeclaration | floatdeclaration | chardeclaration | booleandeclaration;
arraydeclaration: intarrdeclaration | floatarrdeclaration | chararrdeclaration;
booleandeclaration: BOOLEAN id=identifier (EQUALS val=booleanexp)?;
intdeclaration: INTEGER id=identifier (EQUALS (opr|call|identifier(index)?))?;
intarrdeclaration: INTEGER vararrname (EQUALS LBRACE arrval(COMMA arrval)* RBRACE)?;
floatdeclaration: FLOATING_POINT id=identifier (EQUALS (opr|call|identifier(index)?))?;
floatarrdeclaration: FLOATING_POINT vararrname (EQUALS LBRACE arrval (COMMA arrval)* RBRACE)?;
arrval: opr|call|identifier;
chardeclaration: CHARACTER id=identifier (EQUALS (charliteral|call|identifier))?;
chararrdeclaration: STRING id=identifier (EQUALS (stringliteral|call|identifier))?;

//assignment expression
assignment: (id=identifier EQUALS (charliteral | stringliteral| opr | identifier(index)? | booleanexp | call)) | arrayassignment;
arrayassignment: id=identifier index EQUALS (opr | identifier);
index: LBRACKET (identifier | intliteral) RBRACKET;

//conditional statements
condition: ifstatement;
ifstatement: IF nestedcondition start=block (elseifstatement)* (elsestatement)?;
elseifstatement: ELSEIF nestedcondition middle=block;
elsestatement: ELSE end=block;

//looping statements
loop: loopfor | loopwhile | loopdowhile;
loopfor: FOR LPARENTHESIS (assignment | intdeclaration) SEMICOLON booleanexp SEMICOLON (operation|assignment) RPARENTHESIS block;
loopwhile: WHILE nestedcondition block;
loopdowhile: DO block WHILE nestedcondition;

//operations
operation: identifier shortopr;

opr: addopr;
addopr: addopr op=PLUS multopr | addopr op=MINUS multopr | multopr;
multopr: multopr op=MUL terminalopr | multopr op=DIV terminalopr | multopr op=MOD terminalopr | terminalopr;
terminalopr: identifier | intliteral | floatliteral | LPARENTHESIS opr RPARENTHESIS| call;

shortopr: PLUS_PLUS | MINUS_MINUS | (PLUS_EQUALS | MIN_EQUALS | MUL_EQUALS | DIV_EQUALS) INT_LITERAL;

//printing and scanning
print: PRINT printblock;
printblock: LPARENTHESIS stringcontent (PLUS stringcontent)* RPARENTHESIS;
stringcontent: stringliteral | identifier;
scan: SCAN LPARENTHESIS stringliteral COMMA identifier RPARENTHESIS;

//boolean parsing
nestedcondition: LPARENTHESIS booleanexp RPARENTHESIS;
booleanexp: logic;
logic: logic log=(AND | OR) relation | relation;
relation: booleanvalue rel=(EQUALS_EQUALS | NOT_EQUALS | LESS_THAN_EQUALS | LESS_THAN | GREATER_THAN_EQUALS | GREATER_THAN) booleanvalue | booleanvalue | LPARENTHESIS booleanexp RPARENTHESIS | TRUE | FALSE;
booleanvalue: opr | identifier;

//variable array
vararrname: identifier LBRACKET intliteral RBRACKET;

//unary rules
identifier: IDENTIFIER;
charliteral: CHAR_LITERAL;
stringliteral: STRING_LITERAL;
intliteral: INT_LITERAL;
floatliteral: FLOAT_LITERAL;

block: LBRACE statement* RBRACE;

statement: ( declaration | assignment | condition | loop | operation | call | print | scan) SEMICOLON;

//literals
CHAR_LITERAL: QUOTE_S . QUOTE_S;
STRING_LITERAL: QUOTE_D (~'"')* QUOTE_D;
INT_LITERAL: MINUS? DIGIT+;
FLOAT_LITERAL: MINUS? DIGIT+ (DOT DIGIT+)?;

//Conditional keywords
IF: 'si';
ELSE: 'autre';
ELSEIF: 'autre si';

//Looping keywords
FOR: 'pour';
WHILE: 'tandis que';
DO: 'faire';

//Variable types
INTEGER: 'nombre ';
FLOATING_POINT: 'decimale ';
CHARACTER: 'lettre ';
STRING: 'mot ';
BOOLEAN: 'booleen ';
VOID: 'vide ';

//Function keywords
FUNCTION: 'fonction ';
CALL: 'appel ';
PRINT: 'imprimer';
SCAN: 'analyse';
MAIN: 'essentiel';
RETURN: 'rappel ';

//boolean keywords
TRUE: 'vrai';
FALSE: 'faux';

//modifer
PUBLIC: 'publique ';
PRIVATE: 'privee ';
STATIC: 'statique ';
INSTANTIATED: 'instancie ';
PROTECTED: 'protege ';
GLOBAL: 'global ';

//identifier
IDENTIFIER: LETTER LetterorDigit*;

// Special Symbols
LBRACKET: '[';
RBRACKET: ']';
LPARENTHESIS: '(';
RPARENTHESIS: ')';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
SEMICOLON: ';';
DOT: '.';
QUOTE_S: '\'';
QUOTE_D: '"';


//Math Operators
PLUS_PLUS: '++';
MINUS_MINUS: '--';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: '%';

// Assignment Operator
EQUALS: '=';
PLUS_EQUALS: '+=';
MIN_EQUALS: '-=';
MUL_EQUALS: '*=';
DIV_EQUALS: '/=';

// Relational Operators
LESS_THAN: '<';
LESS_THAN_EQUALS: '<=';
GREATER_THAN: '>';
GREATER_THAN_EQUALS: '>=';
EQUALS_EQUALS: '==';
NOT_EQUALS: '!=';

// Logical Operators
AND: '&&';
OR: '||';
NOT: '!';

//digits and letters
DIGIT: [0-9];
LETTER:[a-zA-Z$_];

fragment LetterorDigit: DIGIT | LETTER | '_';

//skip
WS: [ \t\r\n]+ -> skip;