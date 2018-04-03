package fileManagement;

/*
 * Class that serializes a register
 * @author  Jonnathan Juarez
 * @version 1.0
 * @since   2018-03-28
 */

import java.io.Serializable;
import java.util.ArrayList;

public class Registro implements Serializable {
    public ArrayList<String> valores;
    public ArrayList<String> tipo;

    public Registro(ArrayList<String> valores){
        this.valores = valores;

    }

    /**
     * Overrided method to return toString value.
     * @return String
     */
    @Override
    public String toString(){
        String cadena = "";
        for(String s: valores){
            cadena += s +"\t";
        }
        cadena += "\n";
        return cadena;
    }





}
