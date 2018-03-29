package fileManagement;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class BaseDeDatos implements Serializable {
    private ArrayList<String> nombresDeTablas = new ArrayList<>();
    private String name;

    public BaseDeDatos(String name){
        //crea la carpeta
        FolderManager.createFolder(name);
        //set nombre
        this.name = name;
    }
    //crea taba temporal
    public void createTable(String tableName) {
        String path = FolderManager.createPath(this.name, tableName);
        Tabla tabla = new Tabla(tableName);
        FolderManager.toFile(tabla, path);
        nombresDeTablas.add(tableName);
    }
    
    public String dropTable(String nombre){
        String baseDeDatos = this.name;
        String diagnostico = "";
        try{
            File archivo = new File(baseDeDatos + "/" + nombre + ".ser" );
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

    public String showColumn(String nombre ){
        File archivo  =new File(this.name + "/" + nombre + ".ser");
        String respuestaTemporal  ="";
        return respuestaTemporal; 

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
}
