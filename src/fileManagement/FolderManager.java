package fileManagement;

import java.io.File;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class FolderManager {
    private String dataBaseName;
    private String filepath;

    //CREATE DATABASE
    public static String createFolder(String dataBaseName){
        File theDir = new File(dataBaseName);

        //si el folder no existe crea el folder
        if (!theDir.exists()) {
            System.out.println("Creando base de Datos: " + theDir.getName());
            boolean result = false;

            try{
                theDir.mkdir();
                result = true;
            }
            catch(SecurityException se){
                //handle it
            }
            if(result) {
                return "Se creo la base de datos: \t" + dataBaseName;
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
    // DROP DATABASE
    public static String deleteFolder(String dataBaseName){
        File theDir = new File(dataBaseName);

        //si el folder existe crea el folder
        if (theDir.exists()) {
            System.out.println("BORRANDO base de Datos: " + theDir.getName());
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

    // toByteArray and toObject are taken from: http://tinyurl.com/69h8l7x
    public static byte[] toByteArray(Object obj) throws IOException {
        byte[] bytes = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);
            oos.flush();
            bytes = bos.toByteArray();
        }
        finally {
            if (oos != null) {
                oos.close();
            }
            if (bos != null) {
                bos.close();
            }
        }
        return bytes;
    }

    public static Object toObject(byte[] bytes) throws IOException, ClassNotFoundException {
        Object obj = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bis = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bis);
            obj = ois.readObject();
        }
        finally {
            if (bis != null) {
                bis.close();
            }
            if (ois != null) {
                ois.close();
            }
        }
        return obj;
    }

    public static String toString(byte[] bytes) {
        return new String(bytes);
    }

}
