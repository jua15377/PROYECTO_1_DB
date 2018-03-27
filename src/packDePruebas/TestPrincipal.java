package packDePruebas;

import  fileManagement.*;


public class TestPrincipal

{
    public  static void main(String args[]){
        System.out.print("Heelo DBM!\n");
        String mensjae = FolderCreator.createFolder("DB2");
        System.out.print(mensjae);

    }
}
