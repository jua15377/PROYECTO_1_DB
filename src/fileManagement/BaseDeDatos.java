package fileManagement;

import java.io.File;
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
    
    public String dropTable(String nombre){
        String baseDeDatos = this.name;
        String diagnostico = "";
        try{
            File archivo = new File(baseDeDatos + "\\" + nombre + ".ser" );
            if(archivo.delete()){
                diagnostico =  "Tabla " + nombre + " eliminada con exito";
            }
            else{
                diagnostico =  "ERROR: Tabla no existente en Base de Datos " + this.name;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return diagnostico;


    }
    public void agregarRegsitroDeTabla(String nombre){
        nombresDeTablas.add(nombre);
    }

    //SHOW TABLES
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

    public void renameTable(String nombre, String nuevoNombre){

    }

    public void addColumn(String nombreTabla, ArrayList<String> constraints){

    }

    public void addConstraint(){

    }

    public void dropColumn(){

    }

    public void dropConstraint(){

    }

    public String showColumn(String nombre ){
        File archivo  =new File(this.name + "\\" + nombre + ".ser");
        return "";

    }


}
