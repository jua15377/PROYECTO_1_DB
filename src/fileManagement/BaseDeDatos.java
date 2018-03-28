package fileManagement;

import java.io.Serializable;
import java.util.ArrayList;

public class BaseDeDatos implements Serializable {
    private ArrayList nombresDeTablas = new ArrayList<String>();
    private String name;

    public BaseDeDatos(String name){
        //crea la carpeta
        FolderManager.createFolder(name);
        //set nombre
        this.name = name;
    }
    



    public void agregarRegsitroDeTabla(String nombre){
        nombresDeTablas.add(nombre);
    }

    public ArrayList getNombresDeTablas() {
        return nombresDeTablas;
    }

    public void setNombresDeTablas(ArrayList nombresDeTablas) {
        this.nombresDeTablas = nombresDeTablas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return  "Nombre de la DB: " + name + "\n"+
                "Tablas que contiene: " + nombresDeTablas +"\n"+
                "cantidad de tablas: " + nombresDeTablas.size() +"\n";

    }
}
