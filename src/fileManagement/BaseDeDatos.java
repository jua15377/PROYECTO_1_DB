package fileManagement;

import java.util.ArrayList;

public class BaseDeDatos implements java.io.Serializable{
    private ArrayList nombresDeTablas = new ArrayList();
    private String name;

    public BaseDeDatos(){
        // crear la carptea de la DB
        //set nombre
    }
    

    public String toString(){
        return  "Nombre de la DB: " + name + "\n"+
                "tablas que contiene: " + nombresDeTablas +"\n"+
                "cantidad de tablas: " + nombresDeTablas.size() +"\n";

    }
}
