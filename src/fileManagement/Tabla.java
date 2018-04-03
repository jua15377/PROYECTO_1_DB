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

    public Tabla(String name){
        this.name = name;
    }

    public void addRegistro(ArrayList<String> nombres, ArrayList<String> valores){
        ArrayList<String> resultante = new ArrayList<>();
        for (int i = 0; i < nombresDecolumnas.size(); i++ ){
            resultante.add(null);
        }
        int contadordeVal =0;
        for (String str: nombres){
            int indice = nombresDecolumnas.indexOf(str);
            resultante.set(indice, valores.get(contadordeVal));
            contadordeVal++;
        }
        Registro r = new Registro(resultante);
        registros.put(contadorDeregistors, r);
        contadorDeregistors ++;

    }

    @Override
    public String toString() {
        return "soy una tabla y me llamo " + name +"\n" + registros;
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

    /**
     *
     * @return retornala cadena con dscripcoin de las columnas de la tabla
     */
    public String  getColumnsDescription(){
        int size = nombresDecolumnas.size();
        String resul  = "Column\tType\tSizeRestriction\n";
        for (int i = 0; i < size; i ++){
            resul += nombresDecolumnas.get(i)+ "\t" +  tiposDecolumnas.get(i) + "\t" ;
            if(maxlongitud.get(i) == -1){ resul += maxlongitud.get(i) +"\n";}
            else {resul += "\tN/A\n";}
        }

        return resul;

    }
}
