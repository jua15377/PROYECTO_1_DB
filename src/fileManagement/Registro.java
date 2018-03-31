package fileManagement;



import java.io.Serializable;
import java.util.ArrayList;

public class Registro implements Serializable {
    public ArrayList<String> valores = new ArrayList<>();
    public ArrayList<String> tipo = new ArrayList<>();

    public Registro(){}

    public void addValue(String value, String type){
        valores.add(value);
        tipo.add(type);
    }



}
