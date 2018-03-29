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
        BaseDeDatos b1 =  manejador.getASpecificDb("DB1");
        b1.createTable("tablita1");
        b1.createTable("tablita2");
        BaseDeDatos b2 =  manejador.getASpecificDb("meCambieNombreXD");
        b2.createTable("tablita1");
        b2.createTable("tablita2");
        manejador.generateMetada();

    }
}
