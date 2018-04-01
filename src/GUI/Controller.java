package GUI;

import antlrGenerateFiles.PostSQLLexer;
import antlrGenerateFiles.PostSQLParser;
import antlrGenerateFiles.ThrowingErrorListener;
import fileManagement.FolderManager;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import principal.EvalVisitor;

import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller implements Initializable{
    public EvalVisitor eval = new EvalVisitor();

    Stage primaryStage;

    public Controller(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML public CodeArea codeArea = new CodeArea();
    @FXML public TextArea textArea = new TextArea();
    @FXML public TreeView<String> treeView;
    @FXML public MenuItem runMI = new MenuItem();
    @FXML public MenuItem connectMI = new MenuItem();
    @FXML public MenuItem disconnectMI = new MenuItem();
    @FXML public MenuItem importMI = new MenuItem();
    @FXML public MenuItem exportMI = new MenuItem();
    @FXML public MenuItem createMI = new MenuItem();
    @FXML public MenuItem deleteMI = new MenuItem();
    @FXML public MenuItem refreshMI = new MenuItem();
    @FXML public MenuItem fontMI = new MenuItem();
    @FXML public MenuItem aboutMI = new MenuItem();
    @FXML public Button runButton = new Button();

    public int fontSize = 14;

    Image folderIcon = new Image(getClass().getResourceAsStream("/Icons/folder.png"));
    Image textIcon = new Image(getClass().getResourceAsStream("/Icons/text.png"));
    Image imageIcon = new Image(getClass().getResourceAsStream("/Icons/img.png"));
    Image sqlIcon = new Image(getClass().getResourceAsStream("/Icons/sql2.png"));
    Image unkIcon = new Image(getClass().getResourceAsStream("/Icons/unk.png"));
    Image dbIcon = new Image(getClass().getResourceAsStream("/Icons/db.png"));

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        codeArea.setStyle("-fx-font-size: 14");
        textArea.setStyle("-fx-font-size: 14");
        runMI.setDisable(true);
        disconnectMI.setDisable(true);
        importMI.setDisable(true);
        exportMI.setDisable(true);
        createMI.setDisable(true);
        deleteMI.setDisable(true);
        refreshMI.setDisable(true);
        fontMI.setDisable(true);
        codeArea.setEditable(false);
        runButton.setDisable(true);
        //Refreshing the tree view
        refresh();
        primaryStage.setOnCloseRequest(confirmCloseEventHandler);
    }

    private EventHandler<WindowEvent> confirmCloseEventHandler = event -> {
        Alert closeConfirmation = new Alert(
                Alert.AlertType.CONFIRMATION,
                "Are you sure you want to exit?"
        );
        Button exitButton = (Button) closeConfirmation.getDialogPane().lookupButton(
                ButtonType.OK
        );
        exitButton.setText("Exit");
        closeConfirmation.setHeaderText("Confirm Exit");
        closeConfirmation.initModality(Modality.APPLICATION_MODAL);
        closeConfirmation.initOwner(primaryStage);


        Optional<ButtonType> closeResponse = closeConfirmation.showAndWait();
        if (!ButtonType.OK.equals(closeResponse.get())) {

            event.consume();
        }else{
            //Hace aca lo que queres cuando salga
            desconectar();
        }
    };


    public void conectar(){
        runMI.setDisable(false);
        disconnectMI.setDisable(false);
        importMI.setDisable(false);
        exportMI.setDisable(false);
        createMI.setDisable(false);
        deleteMI.setDisable(false);
        refreshMI.setDisable(false);
        fontMI.setDisable(false);
        runButton.setDisable(false);
        codeArea.setEditable(true);
        connectMI.setDisable(true);
        try {
            eval.manejador.reconstruir();
        }

        catch (Exception e){
            System.out.println("Si esta llegando");
        }

    }

    public void desconectar(){
        runMI.setDisable(true);
        connectMI.setDisable(false);
        disconnectMI.setDisable(true);
        importMI.setDisable(true);
        exportMI.setDisable(true);
        createMI.setDisable(true);
        deleteMI.setDisable(true);
        runButton.setDisable(true);
        refreshMI.setDisable(true);
        fontMI.setDisable(true);
        codeArea.setEditable(false);
        eval.manejador.saveState();
    }

    public void refresh(){
        String current ="";
        try {
            current = new File(".").getCanonicalPath() + "/DATABASES";
        } catch (java.io.IOException e ){

        }
        treeView.setRoot(getNodesForDirectory(new File(current)));
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
                if(resp<10 || resp>100) {
                    errorDialog("Error", "Wrong size value", "Please, enter a value in between 10 and 100!");
                    fontSize();
                } else{
                    fontSize = resp;
                    String newFontSize = "-fx-font-size: "+fontSize;
                    codeArea.setStyle(newFontSize);
                    textArea.setStyle(newFontSize);

                }
            }catch(Exception e){
                errorDialog("Error", "Wrong size value", "Please, enter a value in between 10 and 100!");
                fontSize();
            }
        }
    }

    public void errorDialog(String title, String header, String text) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(text);
        alert.showAndWait();
    }

    public void run(){
        eval.setError("");
        eval.log = "";
        textArea.setText("");
        String program = codeArea.getText();
        compile(program);
        refresh();
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
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
            ParseTree tree = parser.program();


            eval.visit(tree);

            if (eval.getError().equals("")) {
                textArea.setText(eval.log);
                //Hacer aqui lo que pasa si no tiene errores
                System.out.println(eval.verbose);

            } else {
                textArea.setText(eval.getError());
            }

        } catch (Exception e) {
            String m = e.toString();
            m = m.replace("org.antlr.v4.runtime.misc.ParseCancellation","");
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
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("aboutController.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("About");
            stage.setResizable(false);
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public TreeItem<String> getNodesForDirectory(File directory) { //Returns a TreeItem representation of the specified directory
        TreeItem<String> root = new TreeItem<String>(directory.getName(), new ImageView(folderIcon));
        root.setExpanded(true);
        for(File f : directory.listFiles()) {
            if(f.isDirectory()) { //Then we call the function recursively
                root.getChildren().add(getNodesForDirectory(f));
            } else {
                if(getFileExtension(f).equals("txt")){
                    root.getChildren().add(new TreeItem<String>(f.getName(), new ImageView(textIcon)));
                }else if(getFileExtension(f).equals("png") || getFileExtension(f).equals("jpg") || getFileExtension(f).equals("jpeg")){
                    root.getChildren().add(new TreeItem<String>(f.getName(), new ImageView(imageIcon)));
                }else if(getFileExtension(f).equals("sql")){
                    root.getChildren().add(new TreeItem<String>(f.getName(), new ImageView(sqlIcon)));
                }else if(getFileExtension(f).equals("dsj")){
                    root.getChildren().add(new TreeItem<String>(f.getName(), new ImageView(dbIcon)));
                }else {
                    root.getChildren().add(new TreeItem<String>(f.getName(), new ImageView(unkIcon)));
                }

            }
        }
        return root;
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }





}