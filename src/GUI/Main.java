package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Crear el archivo de NBaseDeDatos, si este no esta creado.
        String current = new File(".").getCanonicalPath();
        Path path = Paths.get(current + "\\NBaseDeDatos.dsj");
        if (!Files.exists(path)){
            File file = new File(current + "\\NBaseDeDatos.dsj");
            file.createNewFile();
        }

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("sample.fxml"));
        Controller controller = new Controller(primaryStage);
        loader.setController(controller);
        Parent root = loader.load();
        primaryStage.setTitle("Database Manager");
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.show();

    }


    public static void main(String[] args) {

        launch(args);
    }
}
