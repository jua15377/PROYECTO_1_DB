package fileManagement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;

public class Tabla implements Serializable{
    private String Name;
    private ArrayList<String> nombresDecolumnas = new ArrayList<>();
    private ArrayList<String> tiposDecolumnas = new ArrayList<>();
    private String pk = "";
    private String fk = "";
    private Hashtable<Integer, Registro> refistro = new Hashtable<>();



}
