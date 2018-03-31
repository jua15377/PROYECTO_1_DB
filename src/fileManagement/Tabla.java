package fileManagement;

/*
 * clase que contiene las registros y metodos para alterar sus valores.
 * @author  Jonnathan Juarez, Diego Castaneda, Sebastian Galindo
 * @version 1.0
 * @since   2018-03-28
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;

public class Tabla implements Serializable{
    private String name;
    private ArrayList<String> nombresDecolumnas = new ArrayList<>();
    private ArrayList<String> tiposDecolumnas = new ArrayList<>();
    private ArrayList<String> pk = new ArrayList<>();
    private ArrayList<String> fk = new ArrayList<>();
    private Hashtable<Integer, Registro> registro = new Hashtable<>();

    public Tabla(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "soy una tabla y me llamo " + name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getNombresDecolumnas() {
        return nombresDecolumnas;
    }

    public void setNombresDecolumnas(ArrayList<String> nombresDecolumnas) {
        this.nombresDecolumnas = nombresDecolumnas;
    }

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

    public Hashtable<Integer, Registro> getRegistro() {
        return registro;
    }

    public void setRegistro(Hashtable<Integer, Registro> registro) {
        this.registro = registro;
    }
}
