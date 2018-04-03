package fileManagement;



import java.io.Serializable;
import java.util.ArrayList;

public class Registro implements Serializable {
    public ArrayList<String> valores;
    public ArrayList<String> tipo;

    public Registro(ArrayList<String> valores){
        this.valores = valores;

    }
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
