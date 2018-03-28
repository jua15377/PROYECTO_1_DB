package fileManagement;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.ArrayList;

public class Manejador implements Serializable {
    private int contadorDeDB = 0;
    private ArrayList<String> dbsNames = new ArrayList<>();
    private ArrayList<BaseDeDatos> dbs = new ArrayList<>();

     public Manejador(){

     }
     public void createDataBase(String nombre){
        BaseDeDatos baseDeDatos = new  BaseDeDatos(nombre);
        dbsNames.add(nombre);
        dbs.add(baseDeDatos);
        FolderManager.createFolder(nombre);
    }

    public void dropDatabase(String nombre){
        int indice = dbsNames.indexOf(nombre);
        dbsNames.remove(indice);
        dbs.remove(indice);
        FolderManager.deleteFolder(nombre);
    }

    public void  changeDBSname(String oldName, String newName){

    }

}
