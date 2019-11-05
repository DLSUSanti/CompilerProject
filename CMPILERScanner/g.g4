grammar g;

program: globaldelcaration* function* main function* EOF;

//function declaration
main: MAIN block;
function: FUNCTION (INTEGER | FLOATING_POINT | CHARACTER | STRING | VOID) (LBRACKET RBRACKET)? IDENTIFIER LPARENTHESIS (declaration (COMMA declaration)*)? RPARENTHESIS LBRACE statement* (returnstatement)? RBRACE;
call: CALL IDENTIFIER LPARENTHESIS ((IDENTIFIER|opr) (COMMA (IDENTIFIER|opr))*)? RPARENTHESIS;
returnstatement: RETURN (IDENTIFIER|INT_LITERAL|FLOAT_LITERAL|CHAR_LITERAL|STRING_LITERAL|booleanexp|opr) SEMICOLON;

//type declaration
globaldelcaration: GLOBAL declaration SEMICOLON;
declaration: singledeclaration | arraydeclaration;
singledeclaration: intdeclaration | floatdeclaration | chardeclaration | booleandeclaration;
arraydeclaration: intarrdeclaration | floatarrdeclaration | chararrdeclaration;
booleandeclaration: BOOLEAN IDENTIFIER (EQUALS booleanexp (logic booleanexp)*);
intdeclaration: INTEGER IDENTIFIER (EQUALS (INT_LITERAL|opr|call|IDENTIFIER))?;
intarrdeclaration: INTEGER vararrname (EQUALS LBRACE (INT_LITERAL|opr|call|IDENTIFIER)(COMMA (INT_LITERAL|opr|call|IDENTIFIER))* RBRACE)?;
floatdeclaration: FLOATING_POINT IDENTIFIER (EQUALS (FLOAT_LITERAL|opr|call|IDENTIFIER))?;
floatarrdeclaration: FLOATING_POINT vararrname (EQUALS LBRACE (FLOAT_LITERAL|opr|call|IDENTIFIER) (COMMA (FLOAT_LITERAL|opr|call|IDENTIFIER))* RBRACE)?;
chardeclaration: CHARACTER IDENTIFIER (EQUALS (CHAR_LITERAL|call))?;
chararrdeclaration: STRING IDENTIFIER (EQUALS (STRING_LITERAL|call))?;
forcedintdec: INTEGER IDENTIFIER EQUALS (INT_LITERAL|opr|call|IDENTIFIER);

//assignment expression
assignment: IDENTIFIER EQUALS ( opr | CHAR_LITERAL | STRING_LITERAL | call);

//conditional statements
condition: IF nestedcondition block (ELSEIF nestedcondition block)* (ELSE block)?;

//looping statements
loop: loopfor | loopwhile | loopdowhile;
loopfor: FOR LPARENTHESIS (assignment | forcedintdec) SEMICOLON booleanexp SEMICOLON operation RPARENTHESIS block;
loopwhile: WHILE nestedcondition block;
loopdowhile: DO block WHILE nestedcondition;

//operations
operation: IDENTIFIER EQUALS opr | IDENTIFIER shortopr;

opr: addopr;
addopr: addopr PLUS multopr | addopr MINUS multopr | multopr;
multopr: multopr MUL terminalopr | multopr DIV terminalopr | multopr MOD terminalopr | terminalopr;
terminalopr: IDENTIFIER | INT_LITERAL | FLOAT_LITERAL | LPARENTHESIS opr RPARENTHESIS| call;

shortopr: PLUS_PLUS | MINUS_MINUS | (PLUS_EQUALS | MIN_EQUALS | MUL_EQUALS | DIV_EQUALS) INT_LITERAL;

//printing and scanning
print: PRINT printblock;
printblock: LPARENTHESIS printcontent RPARENTHESIS;
printcontent: printcontent PLUS printcontent | STRING_LITERAL | IDENTIFIER;
scan: SCAN LPARENTHESIS STRING_LITERAL COMMA IDENTIFIER RPARENTHESIS;

//boolean parsing
nestedcondition: LPARENTHESIS booleanexp RPARENTHESIS;
booleanexp: LPARENTHESIS booleanexp RPARENTHESIS | NOT booleanexp | booleanexp logic booleanexp | booleanexp relation booleanexp| booleanliteral | opr;
relation: (EQUALS_EQUALS | NOT_EQUALS | LESS_THAN_EQUALS | LESS_THAN | GREATER_THAN_EQUALS | GREATER_THAN);
logic: (AND | OR);
booleanliteral:(TRUE | FALSE);

//variable array
vararrname: IDENTIFIER LBRACKET INT_LITERAL RBRACKET;

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
INTEGER: 'nombre';
FLOATING_POINT: 'decimale';
CHARACTER: 'lettre';
STRING: 'mot';
BOOLEAN: 'booleen';
VOID: 'vide';

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