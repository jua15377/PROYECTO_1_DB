package fileManagement;

import java.io.*;
import java.util.ArrayList;

public class Manejador implements Serializable {
    private int contadorDeDB = 0;
    private ArrayList<String> dbsNames = new ArrayList<>();
    private ArrayList<BaseDeDatos> dbs = new ArrayList<>();
    private String currentDB = null;
     public Manejador(){

     }
     public void createDataBase(String nombre){
        BaseDeDatos baseDeDatos = new  BaseDeDatos(nombre);
        dbsNames.add(nombre);
        dbs.add(baseDeDatos);
        FolderManager.createFolder(nombre);
        this.contadorDeDB ++;
    }

    public void dropDatabase(String nombre){
        int indice = dbsNames.indexOf(nombre);
        dbsNames.remove(indice);
        dbs.remove(indice);
        FolderManager.deleteFolder(nombre);
        this.contadorDeDB --;
    }

    public void  changeDBSname(String oldName, String newName){
        int indice = dbsNames.indexOf(oldName);
        dbs.get(indice).setName(newName);
        dbsNames.set(indice, newName);
        FolderManager.renameFolder(oldName, newName);
    }

    public String showDataBases(){
         String resultado = "";
         for(String elemento: dbsNames){
             resultado += elemento + "\n";
         }
         return resultado;
    }
    public void useDataBase(String nombre){
         this.setCurrentDB(nombre);
    }

    public void fuckDataBase(){
         for(String s: dbsNames){
             dropDatabase(s);
         }
    }

    public String getCurrentDB() {
        return currentDB;
    }

    public void setCurrentDB(String currentDB){
         this.currentDB = currentDB;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void generateMetada(){
         String texto = "";
         texto += "----- Meta Data -----\n";
         texto += "Bases de Datos:" +
                 "cantidad de DBs: " + contadorDeDB + "\n\n";
         texto += "\tnombre de DB\t cant. de tablas";
         for(int indice = 0; indice < dbsNames.size(); indice++ ){
             texto +=  dbsNames.get(indice) +": "+ dbs.get(indice).getNombresDeTablas().size() + "\n";
         }
         texto += "\n----- Final de archivo -----\n";



         FileWriter fichero = null;
         PrintWriter pw;
         try
         {
             fichero = new FileWriter("METADATA.txt");
             pw = new PrintWriter(fichero);
             pw.println(texto);

         }
         catch (Exception e) {
             e.printStackTrace();
         }
         finally {
             try {
                 // asegurarnos que se cierra el fichero.
                 if (null != fichero)
                     fichero.close();
             } catch (Exception e2) {
                 e2.printStackTrace();
             }
         }

     }
}
