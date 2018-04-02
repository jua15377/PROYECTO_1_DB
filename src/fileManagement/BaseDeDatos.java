package fileManagement;
/*
* clase que contiene las tablas y metodos para alterar sus valores.
* @author  Jonnathan Juarez, Diego Castaneda, Sebastian Galindo
* @version 1.0
* @since   2018-03-28
*/

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Class :BaseDeDatos
 * Containar of tables in the DBMS.
 *
 * @author  Jonnathan Juárez, Sebastian Galindo, Diego Castañeda
 * @version 1.0
 * @since   2018-03-30
 */
public class BaseDeDatos implements Serializable {
    private ArrayList<String> nombresDeTablas = new ArrayList<>();

    public ArrayList<Tabla> getTablas() {
        return tablas;
    }

    private ArrayList<Tabla> tablas = new ArrayList<>();
    private String name;

    /**
     * BaseDeDatos
     * Constructor Method
     * @param: String name, the name of the new Data Base
     * @return  nothing
     * **/
    public BaseDeDatos(String name){
        //crea la carpeta
        FolderManager.createFolder(name);
        //set nombre
        this.name = name;
    }

    /**
     * createTable
     * Create Table Method
     * Creates a new Table object, and its corresponding file on the Database Folder.
     * @param: String tableName, the name of the Table and File
     * @return  nothing
     * **/
    public void createTable(String tableName, ArrayList<String> encabezado, ArrayList<String> tipos,ArrayList<String> pk, ArrayList<String> fk , ArrayList<Integer> maximo) {
        String path = FolderManager.createPath(this.name, tableName);
        Tabla tabla = new Tabla(tableName);
        tabla.setNombresDecolumnas(encabezado);
        tabla.setTiposDecolumnas(tipos);
        tabla.setPk(pk);
        tabla.setFk(fk);
        tabla.setMaxlongitud(maximo);
        FolderManager.toFile(tabla, path);
        tablas.add(tabla);
        nombresDeTablas.add(tableName);
    }

    /**
     * dropTable
     * Drop Table Method
     * Eliminates a Table specified on the name and the File corresponding to it
     * @param: String nombre, the name of the Table and File to eliminate
     * @return  nothing
     * **/
    public String dropTable(String nombre){
        int indice = nombresDeTablas.indexOf(nombre);
        nombresDeTablas.remove(indice);
        tablas.remove(indice);
        String baseDeDatos = this.name;
        String diagnostico = "";
        String path = FolderManager.createPath(baseDeDatos, nombre);
        try{
            File archivo = new File(path);
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

    /**
     * getNombresDeTablas
     *  Show Tables Method
     * Shows the user all the tables
     * @param: unused
     * @return  ArrayList<String> nombreDeTablas
     * **/
    public ArrayList<String> getNombresDeTablas() {
        return this.nombresDeTablas;
    }

    /**
     * getName
     * Name Database Method
     * Shows the the name of the Database he is actually in
     * @param: unused
     * @return  String name
     * **/
    public String getName() {
        return name;
    }

    /**
     * setName Method
     * Renames the Database
     * @param: String name, the new name for the Database
     * @return  nothing
     * **/
    public void setName(String name) {
        this.name = name;
    }

    /**
     * toString Method
     * Combines all the information of the class and shows it whenever
     * @param: String name, the new name for the Database
     * @return  String
     * **/
    @Override
    public String toString(){
        return  "Nombre de la DB: " + name + "\n"+
                "Tablas que contiene: " + nombresDeTablas +"\n"+
                "cantidad de tablas: " + nombresDeTablas.size() +"\n";

    }

    public void renameTable(String nombre, String nuevoNombre){
        int indice = nombresDeTablas.indexOf(nombre);
        nombresDeTablas.set(indice,nuevoNombre);
        tablas.get(indice).setName(nuevoNombre);
        Tabla tablaParaArchivNuevo =  tablas.get(indice);
        //falta borrar y recrear el archivo
        FolderManager.deleteFile(this.name, nombre);
        FolderManager.toFile(tablaParaArchivNuevo, "DATABASES\\"+this.name + "\\" +nuevoNombre + ".dsj");

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
        String path = FolderManager.createPath (this.name, nombre);
        File archivo  =new File(path);
        return "";

    }

    /**
     * addTabla Method
     * Adds a new Table to the Database
     * @param: Tabla tabla, the table to be added
     * @return  nothing
     * **/
    public void addTabla(Tabla tabla){
        tablas.add(tabla);
        nombresDeTablas.add(tabla.getName());

    }

    public Tabla getSpecificTable(String tabla){
        int indice = nombresDeTablas.indexOf(tabla);
        return tablas.get(indice);
    }

}
