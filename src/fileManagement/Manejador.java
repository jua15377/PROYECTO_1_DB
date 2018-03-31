package fileManagement;

/*
 * Clase para el manejaddor principal de la base de datos.
 * @author  Jonnathan Juarez, Diego Castaneda, Sebastian Galindo
 * @version 1.0
 * @since   2018-03-28
 */


import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Manejador implements Serializable {
    private int contadorDeDB = 0;
    private ArrayList<String> dbsNames = new ArrayList<>();
    private ArrayList<BaseDeDatos> dbs = new ArrayList<>();
    private String currentDB = null;

    public Manejador(){
        //Se leera NBaseDeDatos para conocer los nombres de todas las base de datos.
        // cada vez que se lea un nombre, se creara un folder y se creara cada objeto.
        //Esto, para utilizar un manejador de acuerdo a lo que ya exisitia.

        ArrayList<String> dbs = getDBfromFiles();


     }
    public void createDataBase(String nombre){
        BaseDeDatos baseDeDatos = new  BaseDeDatos(nombre);
        dbsNames.add(nombre);
        dbs.add(baseDeDatos);
        this.contadorDeDB ++;
        FolderManager.createFolder(nombre);

        //Agregar a NBaseDeDatos una base de datos


        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            File file = new File("NBaseDeDatos.dsj");
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(nombre + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void dropDatabase(String nombre){
        int indice = dbsNames.indexOf(nombre);
        dbsNames.remove(indice);
        dbs.remove(indice);
        FolderManager.deleteFolder(nombre);
        this.contadorDeDB = this.contadorDeDB -1;
        //Borrar de NBaseDeDatos una base de datos
        removeLineFromFile(nombre, "NBaseDeDatos.dsj");

    }

    public void  changeDBSname(String oldName, String newName){
        int indice = dbsNames.indexOf(oldName);
        dbs.get(indice).setName(newName);
        dbsNames.set(indice, newName);
        FolderManager.renameFolder(oldName, newName);
    }

    public String showDataBases(){
        String resultado = "";
        for(String elemento: dbsNames){
            resultado += elemento + "\n";
        }
        return resultado;
    }
    public void useDataBase(String nombre){
         this.setCurrentDB(nombre);
    }

    public void fuckDataBase(){
        for(String s: dbsNames){
            dropDatabase(s);
        }
        //Borrar contenido NBaseDeDatos
    }

    public String getCurrentDB() {
        return currentDB;
    }

    public void setCurrentDB(String currentDB){
         this.currentDB = currentDB;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public BaseDeDatos getASpecificDb(String db){
        int indice = dbsNames.indexOf(db);
        return dbs.get(indice);
    }

    public void generateMetada(){
        String texto = "";
        texto += "----- Meta Data -----\n";
        texto += "Bases de Datos:" +
                "cantidad de DBs: " + contadorDeDB + "\n\n";
        texto += "\tnombre de DB\t cant. de tablas";
        for(int indice = 0; indice < dbsNames.size(); indice++ ){
            texto +=  dbsNames.get(indice) +": "+ dbs.get(indice).getNombresDeTablas().size() + "\n";
        }
        texto += "\n----- Final de archivo -----\n";

        FileWriter fichero = null;
        PrintWriter pw;
        try
        {
            fichero = new FileWriter("METADATA.txt");
            pw = new PrintWriter(fichero);
            pw.println(texto);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
     }
    /**
     * Code creted by TheLittleNaruto
     * Found at: https://stackoverflow.com/questions/1377279/find-a-line-in-a-file-and-remove-it*/
    public void removeLineFromFile(String file, String lineToRemove) {
        try {
            File inFile = new File(file);
            if (!inFile.isFile()) {
                System.out.println("Parameter is not an existing file");
                return;
            }
            //Construct the new file that will later be renamed to the original filename.
            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
            BufferedReader br = new BufferedReader(new FileReader(file));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line = null;

            //Read from the original file and write to the new
            //unless content matches data to be removed.
            while ((line = br.readLine()) != null) {
                if (!line.trim().equals(lineToRemove)) {
                    pw.println(line);
                    pw.flush();
                }
            }
            pw.close();
            br.close();

            //Delete the original file
            if (!inFile.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            //Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(inFile))
                System.out.println("Could not rename file");
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<String> getDBfromFiles(){
        ArrayList<String> names = new ArrayList<>();

        try {

            String current = new File(".").getCanonicalPath();

            File f = new File(current + "\\NBaseDeDatos.dsj");

            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine = "";

            while ((readLine = b.readLine()) != null) {
                System.out.println(readLine);
                names.add(readLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }
}
