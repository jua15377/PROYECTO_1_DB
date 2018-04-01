package packDePruebas;

import  fileManagement.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import  java.util.Scanner;


public class TestPrincipal

{
    public  static void main(String args[]){
//        Scanner s = new Scanner(System.in);
//        System.out.print("Heelo DBM!\n");
//        Manejador manejador = new Manejador();
//        manejador.createDataBase("DB1");
//        manejador.createDataBase("DB2");
//        manejador.createDataBase("DB3");
//        manejador.changeDBSname("DB2", "meCambieNombreXD");
//        BaseDeDatos b1 =  manejador.getASpecificDb("DB1");
//        b1.createTable("tablita1");
//        b1.createTable("tablita2");
//        BaseDeDatos b2 =  manejador.getASpecificDb("meCambieNombreXD");
//        b2.createTable("tablita1");
//        b2.createTable("tablita2");
//        manejador.generateMetada();
        //crear
        //FolderManager.toFile(manejador,"elobjetoTransitivo");
        //desccomentar
//        Manejador manejador1 = (Manejador) FolderManager.toObject("elobjetoTransitivo");
//        manejador1.generateMetada();
        Tabla tabla = new Tabla("latablaDeDiego");
        String[] tipos1 = {"char","char","char","char"};
        ArrayList<String> tipos2= new ArrayList<>(Arrays.asList(tipos1));
        for (int i = 0; i< 300000; i++){
            ArrayList<String> arr = new ArrayList<>();
            arr.add("val1");
            arr.add("val2");
            arr.add("val3");
            arr.add("val3");
            arr.add("val4");
            Registro r = new Registro(arr, tipos2);
            tabla.addRegistro(r);
        }
        System.out.println(tabla.toString());
        FolderManager.toFile(tabla,tabla.getName());



    }
}
