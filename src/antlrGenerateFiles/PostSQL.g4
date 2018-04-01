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
    : unitStatement  (';' unitStatement)*                                       #initProgram
    | unitStatement  (';' unitStatement)* '-v'    						        #initProgramVerbose
    ;

unitStatement
	: 'CREATE' 'DATABASE' ID													#STMcreateDB
	| 'DROP' 'DATABASE' ID 														#STMdropDB
	| 'SHOW' 'DATABASE' 														#STMshowDB
    | 'SHOW' 'TABLE'															#STMshowTable
	| 'USE' 'DATABASE' ID                                                       #STMuseDB
	| 'DROP' 'TABLE' ID     													#STMdropTable
	| 'FUCK' 'DATABASE' 														#STMfuckTable
	| 'CREATE' 'TABLE' ID '(' columDeclaration  constraints* ')' 				#STMcreateTable
	| 'SHOW' 'COLUMNS' FROM ID	                                                #STMshowColumn
    | alter_table 																#STMalterTable
	| insert_into 																#STMinsertInto
	| update 																	#STMupdate
	| delete 																	#STMdelete
	| select 																	#STMselect
	;


constraints
	: CONSTRAINT 'PK_'ID PRIMARY KEY ('(' ID | ID(','ID)* ')')					                     #primaryKeyDeclConstr
	| CONSTRAINT 'FK_'ID FOREIGN KEY ('(' ID | ID(','ID)* ')' REFERENCES ID '(' ID | ID(','ID)* ')') #foreignKeyDeclConstr
	| CONSTRAINT 'CH_'ID CHECK '(' exp ')'										                     #checkDeclConstr
	;


columDeclaration 
	: ID varType 																#simpleColumn
	| ID  varType (','ID  varType)*												#multipleColumn		
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
	: ALTER 'TABLE' ID RENAME TO ID 											#renameTable
	| ALTER 'TABLE' ID action_alter_table  										#alterTable
	;

action_alter_table
	: ADD COLUMN ID varType constraints* 										#addColumn
	| ADD constraints* 															#addConstraints
	| 'DROP' COLUMN ID 															#dropColumn
	| 'DROP' CONSTRAINT ID 														#dropConstraints
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
	: 	INT				            #varint
	|	CHAR				        #varchar
	|	BOOLEAN				        #varboolean
	;
