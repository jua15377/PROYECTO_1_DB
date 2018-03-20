grammar PostSQL

COLON:                   ':';
SEMICOLON:               ';';
CREATE:             'CREATE';
TABLE: 			'TABLE';
DATABASE:	'DATABASE';
DROP:		'DROP';
SHOW: 'SHOW';
PRIMARY_KEY: 'PRIMARY KEY'
FOREING_kEY: 'FOREING KEY'
CONSTRAINT: 'CONSTRAINT'
REFERENCES: 'REFERENCES'

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
	: CONSTRAINT PRIMARY_KEY '(' (ID | ID(',' ID)*) ')'  
	;

foreingKeyDeclaration
	: CONSTRAINT FOREING_kEY '(' (ID | ID(',' ID)*) ')' REFERENCES ID 	
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
