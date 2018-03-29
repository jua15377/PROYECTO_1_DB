package packDePruebas;

import  fileManagement.*;
import  java.util.Scanner;


public class TestPrincipal

{
    public  static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Heelo DBM!\n");
        String mensjae = FolderManager.createFolder("DB1");
        System.out.print(mensjae);
        mensjae = FolderManager.createFolder("DB2");
        System.out.print(mensjae);
        mensjae = FolderManager.renameFolder("DB2","db4");
        System.out.print(mensjae);


    }
}
