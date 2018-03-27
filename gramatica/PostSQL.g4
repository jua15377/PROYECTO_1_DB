grammar PostSQL

COLON: ':';
SEMICOLON: ';';
CREATE: 'CREATE';
TABLE: 'TABLE';
DATABASE: 'DATABASE';
DROP: 'DROP';
SHOW: 'SHOW';
PRIMARY: 'PRIMARY'
KEY: 'KEY';
FOREIGN: 'FOREIGN';
CONSTRAINT: 'CONSTRAINT';
REFERENCES: 'REFERENCES';
FROM: 'FROM'
CHECK: 'CHECK';
ALTER: 'ALTER';
TABLE: 'TABLE';
RENAME: 'RENAME';
TO: 'TO';
ADD: 'ADD';
COLUMN: 'COLUMN';
INSERT_INTO: 'INSERT INTO'; 
VALUES: 'VALUES';
UPDATE: 'UPDATE';
SET: 'SET';
DELETE: 'DELETE';
WHERE: 'WHERE';
FROM : 'FROM';
ORDER_BY: 'ORDER BY'
ASC: 'ASC'; 
DESC: 'DESC';
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
	| insert_into
	| update
	| delete
	| select
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
    : CREATE TABLE ID '(' columDeclaration  constraints* ')'
    ;

constraints
	: primaryKeyDeclaration
	| foreingKeyDeclaration
	| checkDeclaration
	;


columDeclaration 
	: ID varType | ID  varType (','ID  varType)*
	;

primaryKeyDeclaration
	: CONSTRAINT 'PK_'ID PRIMARY KEY '(' ID | ID(','ID)* ')'
	;

foreingKeyDeclaration
	: CONSTRAINT 'FK_'ID FOREIGN KEY '(' ID | ID(','ID)* ')' REFERENCES ID '(' ID | ID(','ID)* ')'
	;

checkDeclaration
	: CONSTRAINT 'CH_'ID CHECK '(' Exp ')'
	;

Exp
	:  (ID | NUM) (eq_op| eq_sgn) (ID | NUM)
    ;

eq_op
	:AND
	|OR
	|NOT
	;

eq_sgn
	:'<'
	|'>'
	|'<='
	|'>='
	|'<>'
	|'='
	;

alter_table
	: ALTER TABLE ID RENAME TO ID
	| ALTER TABLE ID action_alter_table 
	;

action_alter_table
	: ADD COLUMN ID varType constraints*
	| ADD constraints*
	| DROP COLUMN ID
	| DROP CONSTRAINT ID
	;


drop_table
	: DROP TABLE ID
	;

show_tabLe
	: 'SHOW 11'
	;

show_column
	: 'SHOW COLUMNS' FROM ID
	;

fuck_database
	: 'FUCK DATABASE' #deleteAll
	;

insert_into
	: INSERT_INTO ID '(' ID (',' ID)* ')' VALUES '(' varType (',' varType)* ')'
	;

update
	: UPDATE ID SET ID '=' '(' varType (',' varType)* ')' WHERE condicion (eq_op condicion)*
	;

condicion
	: ID eq_sgn ID
	;

delete
	: DELETE FROM ID WHERE condicion (eq_op condicion)*
	;

select
	: SELECT ('*'|ID (','ID)) FROM ID WHERE condicion ORDER_BY ID (ASC |DESC) (',' ID (ADC |DESC))
	;

varType                                         
	: 	INT				            #var_int
	|	CHAR				        #var_char
	|	BOOLEAN				        #var_boolean
	;

