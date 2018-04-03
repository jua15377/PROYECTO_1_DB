package fileManagement;

/*
 * clase que contiene las registros y metodos para alterar sus valores.
 * @author  Jonnathan Juarez, Diego Castaneda, Sebastian Galindo
 * @version 1.0
 * @since   2018-03-28
 */

import java.awt.image.AreaAveragingScaleFilter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;

public class Tabla implements Serializable{
    private String name;
    private ArrayList<String> nombresDecolumnas = new ArrayList<>();
    private ArrayList<String> tiposDecolumnas = new ArrayList<>();
    private ArrayList<Integer> maxlongitud = new ArrayList<>();
    private ArrayList<String> pk = new ArrayList<>();
    private ArrayList<String> fk = new ArrayList<>();
    private ArrayList<String> ck = new ArrayList<>();
    private ArrayList<String> ReferencesFK = new ArrayList<>();
    private Hashtable<Integer, Registro> registros = new Hashtable<>();
    private int contadorDeregistors = 0;

    /**
     * Tabla constructor
     * @param name
     */
    public Tabla(String name){
        this.name = name;
    }

    /**
     * Adds a register to the table
     * @param r
     */
    public void addRegistro(Registro r){
        registros.put(contadorDeregistors, r);
        contadorDeregistors ++;

    }

    /**
     * toString method of Tabla
     * @return String
     */
    @Override
    public String toString() {
        return "soy una tabla y me llamo " + name +"\n" + registros;
    }

    /**
     *
     * @return Name of the table
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a the name of the table.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the names of all columms saved in the table.
     * @return ArrayList<String>
     */
    public ArrayList<String> getNombresDecolumnas() {
        return nombresDecolumnas;
    }

    /**
     * Sets names for all the columns
     * @param nombresDecolumnas
     */
    public void setNombresDecolumnas(ArrayList<String> nombresDecolumnas) {
        this.nombresDecolumnas = nombresDecolumnas;
    }

    /**
     * Returns arraylist of string of all the types of the table columns.
     * @return
     */
    public ArrayList<String> getTiposDecolumnas() {
        return tiposDecolumnas;
    }

    public void setTiposDecolumnas(ArrayList<String> tiposDecolumnas) {
        this.tiposDecolumnas = tiposDecolumnas;
    }

    public ArrayList<String> getPk() {
        return pk;
    }

    public void setPk(ArrayList<String> pk) {
        this.pk = pk;
    }

    public ArrayList<String> getFk() {
        return fk;
    }

    public void setFk(ArrayList<String> fk) {
        this.fk = fk;
    }

    public Hashtable<Integer, Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(Hashtable<Integer, Registro> registros) {
        this.registros = registros;
    }

    public int getContadorDeregistors() {
        return contadorDeregistors;
    }

    public ArrayList<String> getCk() {
        return ck;
    }

    public ArrayList<String> getReferencesFK() {
        return ReferencesFK;
    }

    public void setMaxlongitud(ArrayList<Integer> max){
        this.maxlongitud = max;
    }
}
