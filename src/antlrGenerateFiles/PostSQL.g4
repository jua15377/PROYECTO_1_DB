grammar PostSQL;

COLON: ':';
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
INT: 'INT'; 
CHAR: 'CHAR';
BOOLEAN: 'BOOLEAN';
AND: 'AND';
OR: 'OR';
NOT: 'NOT';
SELECT: 'SELECT';


fragment LETTER : ('a'..'z'|'A'..'Z') ;
fragment DIGIT :'0'..'9' ;


ID : LETTER ( LETTER | DIGIT )* ;
NUM : DIGIT ( DIGIT )* ;
Char : LETTER;

WS :
    [ \t\r\n]+ -> skip
    ;

program
    : ((unitStatement) ';')* 											
    ;

unitStatement
	: 'CREATE' 'DATABASE' ID													#STMcreateDB
	| 'DROP' 'DATABASE' ID 																	#STMdropDB
	| show_database																#STMshowDB
	| create_table																#STMcreateDB
	| alter_table 																#STMalterTable
	| show_table 																#STMshowTable
	| use_database                                                               #STMuseDB
	| drop_table 																#STMdropTable
	| fuck_database 															#STMfuckTable
	| insert_into 																#STMinsertInto
	| update 																	#STMupdate
	| delete 																	#STMdelete
	| select 																	#STMselect
	;





show_database
	: 'SHOW' 'DATABASE'     														#showDatabase
	;

use_database
    : 'USE' 'DATABASE' ID                                                           #useDatabase
    ;

create_table
    : 'CREATE' 'TABLE' ID '(' columDeclaration  constraints* ')' 					#createTable
    ;

constraints
	: primaryKeyDeclaration 													#primaryKeyDeclConstr
	| foreignKeyDeclaration 													#foreignKeyDeclConstr
	| checkDeclaration															#checkDeclConstr
	;


columDeclaration 
	: ID varType 																#simpleColumn
	| ID  varType (','ID  varType)*												#multipleColumn		
	;

primaryKeyDeclaration
	: CONSTRAINT 'PK_'ID PRIMARY KEY ('(' ID | ID(','ID)* ')')					#primaryKeyDecl
	;

foreignKeyDeclaration
	: CONSTRAINT 'FK_'ID FOREIGN KEY ('(' ID | ID(','ID)* ')' REFERENCES ID '(' ID | ID(','ID)* ')') #foreignDecl
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
	: ALTER 'TABLE' ID RENAME TO ID 												#renameTable
	| ALTER 'TABLE' ID action_alter_table  										#alterTable
	;

action_alter_table
	: ADD COLUMN ID varType constraints* 										#addColumn
	| ADD constraints* 															#addConstraints
	| 'DROP' COLUMN ID 															#dropColumn
	| 'DROP' CONSTRAINT ID 														#dropConstraints
	;


drop_table
	: 'DROP' 'TABLE' ID 															#dropTable
	;

show_table
	: 'SHOW' 'TABLE' 																#showTable
	;

show_column
	: 'SHOW' 'COLUMNS' FROM ID													#showColumn
	;

fuck_database
	: 'FUCK' 'DATABASE' 			 												#fuckDatabase
	;

insert_into
	: INSERT_INTO ID '(' ID (',' ID)* ')' VALUES '(' varType (',' varType)* ')'					#insertInto
	;

update
	: UPDATE ID SET ID '=' '(' varType (',' varType)* ')' WHERE condicion (eq_op condicion)* 	#updateDecl
	;

condicion
	: ID eq_sgn ID																				#condicionDecl
	;

delete
	: DELETE FROM ID WHERE condicion (eq_op condicion)* 										#deleteDecl
	;

select
	: SELECT ('*'|ID (','ID)) FROM ID WHERE condicion ORDER_BY ID (ASC |DESC) (',' ID (ASC |DESC)) 	#selectDecl
	;

varType                                         
	: 	INT				            #var_int
	|	CHAR				        #var_char
	|	BOOLEAN				        #var_boolean
	;


