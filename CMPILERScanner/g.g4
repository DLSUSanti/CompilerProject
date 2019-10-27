grammar g;

program: globaldelcaration* function* main function* EOF;

block: ( declaration | assignment | condition | loop | operation | function | call | print) SEMICOLON;

//function declaration
main: MAIN LBRACE block* RBRACE;
function: FUNCTION (INTEGER | FLOATING_POINT | CHARACTER | STRING | VOID) (LBRACKET RBRACKET)? IDENTIFIER LPARENTHESIS (declaration (COMMA declaration)*)? RPARENTHESIS LBRACE block* (returnstatement)? RBRACE;
call: CALL IDENTIFIER LPARENTHESIS (IDENTIFIER (COMMA IDENTIFIER)*)? RPARENTHESIS;
returnstatement: RETURN booleanexp SEMICOLON;

//type declaration
globaldelcaration: GLOBAL declaration SEMICOLON;
declaration: singledeclaration | arraydeclaration;
singledeclaration: intdeclaration | floatdeclaration | chardeclaration | booleandeclaration;
arraydeclaration: intarrdeclaration | floatarrdeclaration | chararrdeclaration;
booleandeclaration: BOOLEAN IDENTIFIER (EQUALS booleanexp (logic booleanexp)*);
intdeclaration: INTEGER IDENTIFIER (EQUALS INT_LITERAL)?;
intarrdeclaration: INTEGER vararrname (EQUALS LBRACE INT_LITERAL(COMMA INT_LITERAL)* RBRACE)?;
floatdeclaration: FLOATING_POINT IDENTIFIER (EQUALS FLOAT_LITERAL)?;
floatarrdeclaration: FLOATING_POINT vararrname (EQUALS LBRACE FLOAT_LITERAL (COMMA FLOAT_LITERAL)* RBRACE)?;
chardeclaration: CHARACTER IDENTIFIER (EQUALS CHAR_LITERAL)?;
chararrdeclaration: STRING IDENTIFIER (EQUALS STRING_LITERAL)?;

//assignment expression
assignment: IDENTIFIER EQUALS (INT_LITERAL | FLOAT_LITERAL | CHAR_LITERAL | STRING_LITERAL);

//conditional blocks
condition: IF LPARENTHESIS booleanexp (logic booleanexp)* RPARENTHESIS LBRACE block* RBRACE (ELSEIF LPARENTHESIS booleanexp (logic booleanexp)* RPARENTHESIS LBRACE block* RBRACE)* (ELSE LBRACE block* RBRACE)?;

//looping blocks
loop: loopfor | loopwhile | loopdowhile;
loopfor: FOR LPARENTHESIS (assignment | declaration) SEMICOLON booleanexp SEMICOLON operation RPARENTHESIS LBRACE block* RBRACE;
loopwhile: WHILE LPARENTHESIS booleanexp RPARENTHESIS LBRACE block* RBRACE;
loopdowhile: DO LBRACE block* RBRACE WHILE LPARENTHESIS booleanexp RPARENTHESIS;

//operations
operation: IDENTIFIER EQUALS opr | IDENTIFIER shortopr;

opr: addopr;
addopr: addopr PLUS multopr | addopr MINUS multopr | multopr;
multopr: multopr MUL terminalopr | multopr DIV terminalopr | multopr MOD terminalopr | terminalopr;
terminalopr: IDENTIFIER | INT_LITERAL | FLOAT_LITERAL | LPARENTHESIS opr RPARENTHESIS;

shortopr: PLUS_PLUS | MINUS_MINUS | (PLUS_EQUALS | MIN_EQUALS | MUL_EQUALS | DIV_EQUALS) INT_LITERAL;

//printing
print: PRINT LPARENTHESIS (STRING_LITERAL | IDENTIFIER)? RPARENTHESIS;

//boolean parsing
booleanexp: (NOT)?booleanvalue(relation booleanvalue)?;
booleanvalue: INT_LITERAL | IDENTIFIER | STRING_LITERAL | CHAR_LITERAL | TRUE | FALSE;
relation: (EQUALS_EQUALS | NOT_EQUALS | LESS_THAN_EQUALS | LESS_THAN | GREATER_THAN_EQUALS | GREATER_THAN);
logic: (AND | OR);

//variable array
vararrname: IDENTIFIER LBRACKET INT_LITERAL RBRACKET;

//literals
CHAR_LITERAL: QUOTE_S . QUOTE_S;
STRING_LITERAL: QUOTE_D .* QUOTE_D;
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
PRINT: 'imprimer ';
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

fragment LetterorDigit: DIGIT | LETTER;

//skip
WS: [ \t\r\n]+ -> skip;