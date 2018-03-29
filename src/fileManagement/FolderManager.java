package fileManagement;

import java.io.*;

public final class FolderManager {
    private String dataBaseName;
    private String filepath;


    public static String createFolder(String dataBaseName){
        File theDir = new File(dataBaseName);

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
        File dir = new File(viejoNombre);
        File newName = new File(nuevoNombre);

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
        File theDir = new File(dataBaseName);

        //si el folder existe crea el folder
        if (theDir.exists()) {
            //System.out.println("BORRANDO base de Datos: " + theDir.getName()+ "\n");
            boolean result = false;

            try{
                theDir.delete();
                result = true;
            }
            catch(SecurityException se){
                //handle it
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


//para la serializacion del objetio

    // toFile and toObject are taken from: http://tinyurl.com/69h8l7x
    public static void toFile(Object obj, String locationAndName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(locationAndName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
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
        return  dataBaseName + "\\" + tableName + ".dsj";

    }

    public static String toString(byte[] bytes) {
        return new String(bytes);
    }

}
