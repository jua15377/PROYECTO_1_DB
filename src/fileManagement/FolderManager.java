package fileManagement;

/*
 * Class that handles files and folders.
 * @author  Jonnathan Juarez
 * @version 1.0
 * @since   2018-03-28
 */

import org.apache.commons.io.FileUtils;
import java.io.*;

public final class FolderManager {
    private String dataBaseName;
    private String filepath;

    /**
     * Creates a new directory with the given name
     * @param dataBaseName
     * @return Message
     */
    public static String createFolder(String dataBaseName){
        File theDir = new File("DATABASES\\"+dataBaseName);

        //si el folder no existe crea el folder
        if (!theDir.exists()) {
            //System.out.println("Creando base de Datos: " + theDir.getName() +"\n");
            boolean result = false;

            try{
                theDir.mkdir();
                result = true;
            }
            catch(SecurityException se){
                //handle it
            }
            if(result) {
                return "\nSe creo la base de datos: \t" + dataBaseName;
            }
            else{
                System.out.println("Error");
            }
        }
        else {
            return  "la Base de datos: " + dataBaseName + ", ya existe!";
        }
        return "no debe de pasar";
    }

    /**
     * Renames the directory of a database. Replaces viejoNombre with nuevoNombre
     * @param viejoNombre
     * @param nuevoNombre
     * @return Status Message
     */
    public static String renameFolder(String viejoNombre, String nuevoNombre){
        File dir = new File("DATABASES\\"+ viejoNombre);
        File newName = new File("DATABASES\\"+nuevoNombre);

        //si el folder existe crea el folder
        if (dir.exists() && dir.isDirectory()) {

            boolean result = false;
            try{
                dir.renameTo(newName);
                result  = true;

            }
            catch(SecurityException se){
                //handle it
            }
            if(result) {
                return "\nnombre cambiado a: " + nuevoNombre+"\n";
            }
            else{
                System.out.println("Error");
            }
        }
        else {
            return "No fue posible encontar el archivo";
        }
        return "no debe de pasar";

    }

    /**
     * Deletes the directory of the given dataBaseName
     * @param dataBaseName
     * @return Status Message
     */
    public static String deleteFolder(String dataBaseName){
        File theDir = new File("DATABASES\\"+dataBaseName);

        //si el folder existe crea el folder
        if (theDir.exists()) {
            System.out.println("BORRANDO base de Datos: " + theDir.getName()+ "\n");
            boolean result = false;

            try{
                FileUtils.deleteDirectory(theDir);
                result = true;
            }
            catch(SecurityException se){
                //handle it
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(result) {
                return "Se BORRO la base de datos: \t" + dataBaseName;
            }
            else{
                System.out.println("Error");
            }
        }
        else {
            return  "la Base de datos: " + dataBaseName + ", NO existe!";
        }
        return "no debe de pasar";
    }

    /**
     * Deletes a file of the database
     * @param dataBaseName
     * @param tabla
     * @return Status Message
     */
    public static String deleteFile(String dataBaseName, String tabla){
        File theTable = new File("DATABASES\\"+dataBaseName + "\\" +tabla + ".dsj");

        //si el folder existe crea el folder
        if (theTable.exists()) {
            //System.out.println("BORRANDO base de Datos: " + theDir.getName()+ "\n");
            boolean result = false;

            try{
                theTable.delete();
                result = true;
            }
            catch(SecurityException se){
                //handle it
            }
            if(result) {
                return "Se borro la tabla: \t" + tabla;
            }
            else{
                System.out.println("Error");
            }
        }
        else {
            return  "La tabla: " + tabla + ", NO existe!";
        }
        return "no debe de pasar";
    }

    /**
     * Deletes master.dsj file to rebuild it with the new changes to the database.
     * @return Status Message
     */
    public static String deleteMaster(){
        File theTable = new File("DATABASES\\"+"MASTER.dsj");

        //si el folder existe crea el folder
        if (theTable.exists()) {
            //System.out.println("BORRANDO base de Datos: " + theDir.getName()+ "\n");
            boolean result = false;

            try{
                theTable.delete();
                result = true;
            }
            catch(SecurityException se){
                //handle it
            }
            if(!result) {
                System.out.println("ERROR: SafeMaster en problemas");
            }

        }
        else {
            return  "MASTER NO ENCONTRADO";
        }
        return "no debe de pasar";
    }


    // toFile and toObject are taken from: http://tinyurl.com/69h8l7x
    /*
    * Metodo para serializar un objeto y guardar sus atributos en un arcchivo. desj
    * @param obj objeto a serializar
    * @retun void */
    public static void toFile(Object obj, String locationAndName) {
        FileOutputStream fileOut = null;
        ObjectOutputStream out = null;
        try {
            fileOut = new FileOutputStream(locationAndName);
            out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            //System.out.println("Serialized data is saved in" + locationAndName +"\n");
        }
        catch (IOException i) {
            i.printStackTrace();
        }

    }
    /*
     * Metodo para deserializar un archivo y guardar su contenido en un objeto
     * @param String locationAndName del archivo .dsj
     * @retun Object obj objeto a ser casteado */

    public static Object toObject(String locationAndName){
        Object obj = null;
        //ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(locationAndName);
            ois = new ObjectInputStream(fileIn);
            obj = ois.readObject();
            fileIn.close();
            ois.close();

        }
        catch (IOException i) {
            i.printStackTrace();
        }
        catch (ClassNotFoundException c) {
            System.out.println("class not found");
            c.printStackTrace();
        }
        return obj;
    }

    /**
     * Creates a path for a table in a specific database directory.
     * @param dataBaseName
     * @param tableName
     * @return Status Message
     */
    public static String createPath(String dataBaseName, String tableName){
        return  "DATABASES\\" + dataBaseName + "\\" + tableName + ".dsj";

    }

    /**
     * Method to rename in the files the TABLE with changed values
     * @param currentDB
     * @param tablaActualizar
     */
    public static void actualizarArchivo(String currentDB, Tabla tablaActualizar){
        FolderManager.deleteFile(currentDB, tablaActualizar.getName());
        FolderManager.toFile(tablaActualizar, "DATABASES\\"+currentDB+ "\\" +tablaActualizar.getName()+ ".dsj");
    }

    /**
     * Generates string
     * @param bytes
     * @return Status Meesage
     */
    public static String toString(byte[] bytes) {
        return new String(bytes);
    }

}
