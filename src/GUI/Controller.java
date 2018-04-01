package GUI;

import antlrGenerateFiles.PostSQLLexer;
import antlrGenerateFiles.PostSQLParser;
import antlrGenerateFiles.ThrowingErrorListener;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import principal.EvalVisitor;

import java.io.*;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller implements Initializable{

    Stage primaryStage;

    public Controller(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML public CodeArea codeArea = new CodeArea();
    @FXML public TextArea textArea = new TextArea();
    @FXML public TreeView<String> treeView;
    public int fontSize = 14;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        codeArea.setStyle("-fx-font-size: 14");
        textArea.setStyle("-fx-font-size: 14");


        /*
        DirectoryChooser dc = new DirectoryChooser();
        dc.setInitialDirectory(new File(System.getProperty("user.home")));
        File choice = dc.showDialog(primaryStage);
        if(choice == null || ! choice.isDirectory()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Could not open directory");
            alert.setContentText("The file is invalid.");
            alert.showAndWait();
        } else {
            treeView.setRoot(getNodesForDirectory(choice));
        }*/
    }

    public void conectar(){

    }

    public void desconectar(){

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

    public void fontSize(){
        TextInputDialog dialog = new TextInputDialog(""+fontSize);
        dialog.setTitle("Font Size");
        dialog.setHeaderText("Please enter the desired font size");
        dialog.setContentText("Font size:");

        // Traditional way to get the response value.
        dialog.getContentText();
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
            String r = result.get();
            try{
                int resp = Integer.parseInt(r);
                if(resp<10 || resp>100){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Wrong size value");
                    alert.setContentText("Please, enter a value in between 10 and 100!");
                    alert.showAndWait();
                }else{
                    fontSize = resp;
                    String newFontSize = "-fx-font-size: "+fontSize;
                    codeArea.setStyle(newFontSize);
                    textArea.setStyle(newFontSize);

                }
            }catch(Exception e){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Wrong size value");
                alert.setContentText("Please, enter a value in between 10 and 100!");
                alert.showAndWait();
            }



        }
        /*
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("fontsize.fxml"));
            /*
             * if "fx:controller" is not set in fxml
             * fxmlLoader.setController(NewWindowController);
             *
            Scene scene = new Scene(fxmlLoader.load(), 400, 265);
            Stage stage = new Stage();
            stage.setTitle("Font Size");
            stage.setScene(scene);

            stage.show();

        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Sorry :(");
            alert.setContentText("Ooops, there was an error loading the Font Size window!");

            alert.showAndWait();
        }
        String newFontSize = "-fx-font-size: "+fontSize;
        codeArea.setStyle(newFontSize);
        textArea.setStyle(newFontSize);*/

    }

    public void run(){
        //hace lo que querras aca jj
        textArea.setText("");
        String program = codeArea.getText();
        compile(program);
    }

    public void compile(String expression) {

        try {

            textArea.setText("");
            CharStream stream = CharStreams.fromString(expression);
            PostSQLLexer lexer = new PostSQLLexer(stream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

            TokenStream tokenStream = new CommonTokenStream(lexer);
            PostSQLParser parser = new PostSQLParser(tokenStream);
            //parser.removeErrorListeners();
            //parser.addErrorListener(ThrowingErrorListener.INSTANCE);
            ParseTree tree = parser.program();

            EvalVisitor eval = new EvalVisitor();
            eval.visit(tree);

            if (eval.getError().equals("")) {
                //Hacer aqui lo que pasa si no tiene errores

            } else {
                textArea.setText(eval.getError());
            }

        } catch (Exception e) {
            String m = e.toString();
            textArea.setText(m);
            //
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


    public void about(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Acerca del proyecto");
        alert.setHeaderText("¡Gracias por utilizarnos!");
        alert.setContentText("Este manejador de bases de datos es el Proyecto # 1 del curso Bases de Datos de la Universidad" +
                " del Valle de Guatemala. " +
                "Fue realizado en el lenguaje de programacion Java, en conjunto con la herramienta de reconocimiento de " +
                "lenguajes ANTLR y basado en las reglas del lenguaje de BD SQL. \n\nMuchas gracias por utilizar nuestro programa." +
                "\n\nAtentamente,\nDiego Castaneda\nJonnathan Juarez\nSebastian Galindo\n\nGuatemala, 2018.");
        alert.showAndWait();
    }


    public TreeItem<String> getNodesForDirectory(File directory) { //Returns a TreeItem representation of the specified directory
        TreeItem<String> root = new TreeItem<String>(directory.getName());
        for(File f : directory.listFiles()) {
            if(f.isDirectory()) { //Then we call the function recursively
                root.getChildren().add(getNodesForDirectory(f));
            } else {
                root.getChildren().add(new TreeItem<String>(f.getName()));
            }
        }
        return root;
    }





}