package fileManagement;

/*
 * Clase encargada  lo relacionado al mejo de archivos
 * @author  Jonnathan Juarez
 * @version 1.0
 * @since   2018-03-28
 */

import org.apache.commons.io.FileUtils;

import java.io.*;

public final class FolderManager {
    private String dataBaseName;
    private String filepath;


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


//para la serializacion del objetio

    // toFile and toObject are taken from: http://tinyurl.com/69h8l7x
    public static void toFile(Object obj, String locationAndName) {
        FileOutputStream fileOut = null;
        ObjectOutputStream out = null;
        try {
            fileOut = new FileOutputStream(locationAndName);
            out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in" + locationAndName +"\n");
        }
        catch (IOException i) {
            i.printStackTrace();
        }

    }

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

    public static String createPath(String dataBaseName, String tableName){
        return  "DATABASES\\" + dataBaseName + "\\" + tableName + ".dsj";

    }

    /**
     * Method to rename in the files the TABLE with changed values**/
    public static void actualizarArchivo(String currentDB, Tabla tablaActualizar){
        FolderManager.deleteFile(currentDB, tablaActualizar.getName());
        FolderManager.toFile(tablaActualizar, "DATABASES\\"+currentDB+ "\\" +tablaActualizar.getName()+ ".dsj");
    }

    public static String toString(byte[] bytes) {
        return new String(bytes);
    }

}
