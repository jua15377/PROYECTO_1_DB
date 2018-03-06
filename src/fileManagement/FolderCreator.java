package fileManagement;

import java.io.File;

public final class FolderCreator {
    private String dataBaseName;
    private String filepath;

    private FolderCreator(){
    }

    public static void createFolder(String dataBaseName, String filepath){
        File theDir = new File(dataBaseName);

        //si el folder no existe crea el folder
        if (!theDir.exists()) {
            System.out.println("creating directory: " + theDir.getName());
            boolean result = false;

            try{
                theDir.mkdir();
                result = true;
            }
            catch(SecurityException se){
                //handle it
            }
            if(result) {
                System.out.println("DIR created");
            }
            else{
                System.out.println("Error");
            }
        }

    }

}
