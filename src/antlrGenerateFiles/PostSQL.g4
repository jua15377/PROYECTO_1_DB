grammar PostSQL;

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
	| 'SHOW' 'DATABASES' 														#STMshowDB
    | 'SHOW' 'TABLE'															#STMshowTable
	| 'USE' 'DATABASE' ID                                                       #STMuseDB
	| 'ALTER' 'DATABASE' ID 'RENAME' 'TO' ID                                    #STMalterDB
	| 'DROP' 'TABLE' ID     													#STMdropTable
	| 'FUCK' 'DATABASE' 														#STMfuckTable
	| 'CREATE' 'TABLE' ID '(' columDeclaration  constraints* ')' 				#STMcreateTable
	| 'SHOW' 'COLUMNS' 'FROM' ID	                                            #STMshowColumn
    | alter_table   															#STMalterTable
	| insert_into 																#STMinsertInto
	| update 																	#STMupdate
	| delete 																	#STMdelete
	| select 																	#STMselect
	;


constraints
	: 'CONSTRAINT' 'PK_'ID 'PRIMARY' 'KEY' ('(' ID | ID(','ID)* ')')					                    #primaryKeyDeclConstr
	| 'CONSTRAINT' 'FK_'ID 'FOREIGN' 'KEY' ('(' ID | ID(','ID)* ')' 'REFERENCES' ID '(' ID | ID(','ID)* ')')  #foreignKeyDeclConstr
	| 'CONSTRAINT' 'CH_'ID 'CHECK' '(' exp ')'										                            #checkDeclConstr
	;


columDeclaration 
	: ID varType 																#simpleColumn
	| ID varType ( ',' ID  varType)*												#multipleColumn
	;

exp
	:  (ID | NUM) (eq_op| eq_sgn) (ID | NUM)	  								#expDecl
	;

eq_op
	:'AND'																		#andOperation
	|'OR' 																		#orOperation
	|'NOT' 																		#notOperation
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
	: 'ALTER' 'TABLE' ID 'RENAME' 'TO' ID 											#renameTable
	| 'ALTER' 'TABLE' ID action_alter_table  										#alterTable
	;

action_alter_table
	: 'ADD' 'COLUMN' ID varType constraints* 										#addColumn
	| 'ADD' constraints* 															#addConstraints
	| 'DROP' 'COLUMN' ID 															#dropColumn
	| 'DROP' 'CONSTRAINT' ID 														#dropConstraints
	;




insert_into
	: 'INSERT' 'INTO' ID '(' ID (',' ID)* ')' 'VALUES' '(' varType (',' varType)* ')'					#insertInto
	;

update
	: 'UPDATE' ID 'SET' ID '=' '(' varType (',' varType)* ')' 'WHERE' condicion (eq_op condicion)* 	#updateDecl
	;

condicion
	: ID eq_sgn ID																				#condicionDecl
	;

delete
	: 'DELETE' 'FROM' ID 'WHERE' condicion (eq_op condicion)* 										#deleteDecl
	;

select
	: 'SELECT' ('*'|ID (','ID)) 'FROM' ID 'WHERE' condicion 'ORDER' 'BY' ID ('ASC' |'DESC') (',' ID ('ASC' |'DESC')) 	#selectDecl
	;

varType
	: 	'INT'				           #varint
	|	'CHAR'				        #varchar
	|	'FLOAT'				        #varfloat
	|	'DATE'						#vardate
	;
