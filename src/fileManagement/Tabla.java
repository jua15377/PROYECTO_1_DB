package fileManagement;

import javafx.scene.control.Tab;

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





}
