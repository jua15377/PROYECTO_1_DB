package GUI;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.Stage;

public class Controller implements Initializable{

    Stage primaryStage;

    public Controller(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML public CodeArea codeArea = new CodeArea();
    @FXML public TextArea textArea = new TextArea();
    public int fontSize = 14;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        codeArea.setStyle("-fx-font-size: 14");
        textArea.setStyle("-fx-font-size: 14");

    }

    public void loadQuerys(){
        FileChooser fileChooser = new FileChooser();

        // Set extension filter
        FileChooser.ExtensionFilter extFilter =
                new FileChooser.ExtensionFilter("TEXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        extFilter = new FileChooser.ExtensionFilter("SQL files (*.sql)", "*.sql");
        fileChooser.getExtensionFilters().add(extFilter);

        fileChooser.getExtensionFilters().addAll();
        fileChooser.setTitle("Open Grammar File");
        File selectedFile = fileChooser.showOpenDialog(null);
        if(selectedFile!=null){
            selectedFile.getAbsoluteFile();
            codeArea.replaceText(readFile(selectedFile));
        }

    }

    public void saveQuerys(){
        FileChooser fileChooser = new FileChooser();

        // Set extension filter
        FileChooser.ExtensionFilter extFilter =
                new FileChooser.ExtensionFilter("TEXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        extFilter = new FileChooser.ExtensionFilter("SQL files (*.sql)", "*.sql");
        fileChooser.getExtensionFilters().add(extFilter);

        //Show save file dialog
        File file = fileChooser.showSaveDialog(primaryStage);

        if(file != null){
            SaveFile(codeArea.getText(), file);
        }
    }

    private void SaveFile(String content, File file){
        try {
            FileWriter fileWriter;

            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException ex) {

        }

    }

    private String readFile(File file){
        StringBuilder stringBuffer = new StringBuilder();
        BufferedReader bufferedReader = null;
        String cadena="";
        try {

            bufferedReader = new BufferedReader(new FileReader(file));
            bufferedReader.toString();
            String text;

            while ((text = bufferedReader.readLine()) != null) {
                stringBuffer.append(text);
                cadena+=text+"\n";
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return cadena;
    }

    public void increaseFontSize(){
        fontSize+=10;
        String cadena = "-fx-font-size: "+fontSize;
        codeArea.setStyle(cadena);
        textArea.setStyle(cadena);

    }

    public void decreaseFontSize(){
        fontSize-=10;
        String cadena = "-fx-font-size: "+fontSize;
        codeArea.setStyle(cadena);
        textArea.setStyle(cadena);
    }

    public void about(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Acerca del proyecto");
        alert.setHeaderText("¡Gracias por utilizarnos!");
        alert.setContentText("Este manejador de bases de datos es el Proyecto # 1 del curso Bases de Datos de la Universidad" +
                "del Valle de Guatemala. " +
                "Fue realizado en el lenguaje de programacion Java, en conjunto con la herramienta de reconocimiento de " +
                "lenguajes ANTLR y basado en las reglas del lenguaje de BD SQL. \n\nMuchas gracias por utilizar nuestro programa." +
                "\n\nAtentamente,\nDiego Castaneda\nJonnathan Juarez\nSebastian Galindo\n\nGuatemala, 2018.");


        alert.showAndWait();
    }



}