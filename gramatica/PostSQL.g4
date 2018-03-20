grammar PostSQL

COLON: ':';
SEMICOLON: ';';
CREATE: 'CREATE';
TABLE: 'TABLE';
DATABASE: 'DATABASE';
DROP: 'DROP';
SHOW: 'SHOW';
KEY: 'KEY';
PRIMARY: 'PRIMARY';
FOREING: 'FOREING';
CONSTRAINT: 'CONSTRAINT';
REFERENCES: 'REFERENCES';

CHECK: 'CHECK';
ALTER: 'ALTER';
TABLE: 'TABLE';
RENAME: 'RENAME';
TO: 'TO'
ADD: 'ADD';
COLUMN: 'COLUMN';

ragment LETTER : ('a'..'z'|'A'..'Z') ;
fragment DIGIT :'0'..'9' ;


ID : LETTER ( LETTER | DIGIT )* ;
NUM : DIGIT ( DIGIT )* ;
Char : LETTER;


WS : 
    [\t\r\n\f ]+ -> skip
    ;



sql_script
    : ((unit_statement) SEMICOLON?)* 
    ;

unit_statement
	: create_database
	| drop_database
	| show_database
	| use_database
	| create_table
	| alter_table
	| show_table
	| drop_table
	| fuck_database
	;

create_database
	: CREATE DATABASE ID 
	;

drop_database
	: DROP DATABASE ID 
	;

show_database
	: SHOW DATABASE
	;

create_table
    : CREATE TABLE ID '(' columDeclaration (columDeclaration)* primaryKeyDeclaration? ')'
    ;

columDeclaration 
	: ID varType ','
	;

primaryKeyDeclaration
	: CONSTRAINT PRIMARY KEY '(' (ID | ID(',' ID)*) ')'
	;

// SE DEBE DE TERMINAR EL REFERENCIES ID
foreingKeyDeclaration
	: CONSTRAINT FOREING kEY '(' (ID | ID(',' ID)*) ')' REFERENCES ID
	;


checkDeclaration
	: ID CHECK '(' Exp ')'
	;

Exp
	:True
	|False
	|(expression((eq_op|eq_sgn) expression)*)
	;

eq_OP
	:AND
	|OR
	|NOT
	;

eq_sgn
	:<
	|>
	|<=
	|>=
	|<>
	|=
	;

alter_table
	: ALTER TABLE ID RENAME TO ID
	| ALTER TABLE action_alter_table
	;

action_alter_table
	: ADD COLUMN ID varType CONTRAINT
	;


drop_table
	: DROP TABLE ID
	;

fuck_database
	: 'FUCK DATABASE' #deleteAll
	;


varType                                         
	: 	INT				            #var_int
	|	CHAR				        #var_char
	|	BOOLEAN				        #var_boolean
	;
