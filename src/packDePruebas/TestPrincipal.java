package packDePruebas;

import  fileManagement.*;
import  java.util.Scanner;


public class TestPrincipal

{
    public  static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Heelo DBM!\n");
        Manejador manejador = new Manejador();
        manejador.createDataBase("DB1");
        manejador.createDataBase("DB2");
        manejador.createDataBase("DB3");
        manejador.changeDBSname("DB2", "meCambieNombreXD");


    }
}
