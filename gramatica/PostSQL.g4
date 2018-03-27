grammar PostSQL;

COLON: ':';
SEMICOLON: ';';
CREATE: 'CREATE';
TABLE: 'TABLE';
DATABASE: 'DATABASE';
DROP: 'DROP';
SHOW: 'SHOW';
PRIMARY: 'PRIMARY';
KEY: 'KEY';
FOREIGN: 'FOREIGN';
CONSTRAINT: 'CONSTRAINT';
REFERENCES: 'REFERENCES';
FROM: 'FROM';
CHECK: 'CHECK';
ALTER: 'ALTER';
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
ORDER_BY: 'ORDER BY';
ASC: 'ASC'; 
DESC: 'DESC';
fragment LETTER : ('a'..'z'|'A'..'Z') ;
fragment DIGIT :'0'..'9' ;


ID : LETTER ( LETTER | DIGIT )* ;
NUM : DIGIT ( DIGIT )* ;
Char : LETTER;


sql_script
    : ((unit_statement) SEMICOLON?)* 											#sqlScript
    ;

unit_statement
	: create_database															#createDB_STM
	| drop_database																#dropDB_STM
	| show_database																#showDB_STM
	| create_table																#createDB_STM
	| alter_table 																#alterTable_STM
	| show_table 																#showTable_STM
	| drop_table 																#dropTable_STM
	| fuck_database 															#fuckTable_STM
	| insert_into 																#insertInto_STM
	| update 																	#update_STM
	| delete 																	#delete_STM
	| select 																	#select_STM
	;

create_database
	: CREATE DATABASE ID														#createDatabase
	;

drop_database
	: DROP DATABASE ID 															#dropDatabase
	;

show_database
	: SHOW DATABASE     														#showDatabase
	;

create_table
    : CREATE TABLE ID '(' columDeclaration  constraints* ')' 					#createTable
    ;

constraints
	: primaryKeyDeclaration 													#primaryKeyDeclConstr
	| foreignKeyDeclaration 													#foreignKeyDeclConstr
	| checkDeclaration															#checkDeclConstr
	;


columDeclaration 
	: ID varType | ID  varType (','ID  varType)*								#columnDecl
	;

primaryKeyDeclaration
	: CONSTRAINT 'PK_'ID PRIMARY KEY '(' ID | ID(','ID)* ')'					#primaryKeyDecl
	;

foreignKeyDeclaration
	: CONSTRAINT 'FK_'ID FOREIGN KEY '(' ID | ID(','ID)* ')' REFERENCES ID '(' ID | ID(','ID)* ')' #foreignDecl
	;

checkDeclaration
	: CONSTRAINT 'CH_'ID CHECK '(' exp ')'										#checkDecl
	;

exp
	:  (ID | NUM) (eq_op| eq_sgn) (ID | NUM)	  								#expDecl
	;

eq_op
	:AND																		#andOperation
	|OR 																		#orOperation
	|NOT 																		#notOperation
	;

eq_sgn
	:'<'																		#menorQueOp
	|'>' 																		#mayorQueOP
	|'<='																		#menorIgualQueOp	
	|'>='																		#mayorIgualQueOp
	|'<>'																		#diferenteOP
	|'='																		#igualOP
	;

alter_table
	: ALTER TABLE ID RENAME TO ID 												#renameTable
	| ALTER TABLE ID action_alter_table  										#alterTable
	;

action_alter_table
	: ADD COLUMN ID varType constraints* 										#addColumn
	| ADD constraints* 															#addConstraints
	| DROP COLUMN ID 															#dropColumn
	| DROP CONSTRAINT ID 														#dropConstraints
	;


drop_table
	: DROP TABLE ID 															#dropTable
	;

show_tabLe
	: 'SHOW TABLE' 																#showTable
	;

show_column
	: 'SHOW COLUMNS' FROM ID													#showColumn
	;

fuck_database
	: 'FUCK DATABASE' 			 												#fuckDatabase
	;

insert_into
	: INSERT_INTO ID '(' ID (',' ID)* ')' VALUES '(' varType (',' varType)* ')'						#insertInto
	;

update
	: UPDATE ID SET ID '=' '(' varType (',' varType)* ')' WHERE condicion (eq_op condicion)* 		#update
	;

condicion
	: ID eq_sgn ID																					#condicion
	;

delete
	: DELETE FROM ID WHERE condicion (eq_op condicion)* 											#delete
	;

select
	: SELECT ('*'|ID (','ID)) FROM ID WHERE condicion ORDER_BY ID (ASC |DESC) (',' ID (ADC |DESC)) 	#select
	;

varType                                         
	: 	INT				            #var_int
	|	CHAR				        #var_char
	|	BOOLEAN				        #var_boolean
	;

WS : 
    [\t\r\n\f ]+ -> skip
    ;
