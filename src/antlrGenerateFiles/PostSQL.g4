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
	: 'CREATE' 'DATABASE' ID													                        #STMcreateDB
	| 'DROP' 'DATABASE' ID 														                        #STMdropDB
	| 'SHOW' 'DATABASES' 														                        #STMshowDB
    | 'SHOW' 'TABLES'															                        #STMshowTable
	| 'USE' 'DATABASE' ID                                                                               #STMuseDB
	| 'ALTER' 'DATABASE' ID 'RENAME' 'TO' ID                                                            #STMalterDB
	| 'DROP' 'TABLE' ID     													                        #STMdropTable
	| 'FUCK' 'DATABASE' 														                        #STMfuckTable
	| 'CREATE' 'TABLE' ID '(' columDeclaration  constraints* ')' 				                        #STMcreateTable
	| 'SHOW' 'COLUMNS' 'FROM' ID	                                                                    #STMshowColumn
    | 'ALTER' 'TABLE' ID action_alter_table  									                        #STMalterTable
	| 'INSERT' 'INTO' ID ('(' ID (',' ID)* ')')? 'VALUES' '(' varType (',' varType)* ')'	                  #STMinsertInto
	| 'UPDATE' ID 'SET' ID '=' '(' varType (',' varType)* ')' 'WHERE' condicion (eq_op condicion)*      #STMupdate
	| 'DELETE' 'FROM' ID 'WHERE' condicion (eq_op condicion)* 										    #STMdelete
	| 'SELECT' ('*'|ID (','ID)) 'FROM' ID 'WHERE' condicion 'ORDER' 'BY' ID ('ASC' |'DESC') (',' ID ('ASC' |'DESC')) 	#STMselect
	;


constraints
	: 'CONSTRAINT' 'PK_'ID 'PRIMARY' 'KEY' '('( ID | ID(','ID)* )')'					                        #primaryKeyDeclConstr
	| 'CONSTRAINT' 'FK_'ID 'FOREIGN' 'KEY' '('( ID | ID(','ID)*) ')' 'REFERENCES' ID '(' (ID | ID(','ID)*) ')'  #foreignKeyDeclConstr
	| 'CONSTRAINT' 'CH_'ID 'CHECK' '(' exp ')'										                            #checkDeclConstr
	;


columDeclaration 
	: ID varType ( ',' ID  varType)*											#multipleColumn
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

action_alter_table
	: 'ADD' 'COLUMN' ID varType constraints* 										#addColumn
	| 'ADD' constraints constraints*												#addConstraints
	| 'DROP' 'COLUMN' ID 															#dropColumn
	| 'DROP' 'CONSTRAINT' ID 														#dropConstraints
	| 'RENAME' 'TO' ID 										                    	#renameTable
	;


condicion
	: ID eq_sgn ID																				#condicionDecl
	;


varType
	: 	'INT'				        #varint
	|	'CHAR'				        #varchar
	|	'FLOAT'				        #varfloat
	|	'DATE'						#vardate
	|   'NULL'                      #varnull
	;
