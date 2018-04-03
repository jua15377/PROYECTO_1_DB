package GUI;

/*
 * Main class that initiates the GUI for the DBMS. It creates a new Scene and it´s displayed.
 * @author  Jonnathan Juarez, Diego Castaneda, Sebastian Galindo
 * @version 1.0
 * @since   2018-03-28
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    /**
     * start
     * Creates a new stage of javaFX and displays a new Scene
     * @param: primaryStage
     * @return void
     * **/
    @Override
    public void start(Stage primaryStage) throws Exception{
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
