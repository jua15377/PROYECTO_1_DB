package fileManagement;

import java.io.File;

public final class FolderCreator {
    private String dataBaseName;
    private String filepath;

    private FolderCreator(){
    }
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


}
