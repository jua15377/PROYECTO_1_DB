package GUI;

/*
 * Controller class for the GUI .fxml file.
 * @author  Jonnathan Juarez, Diego Castaneda, Sebastian Galindo
 * @version 1.0
 * @since   2018-03-28
 */


import antlrGenerateFiles.PostSQLLexer;
import antlrGenerateFiles.PostSQLParser;
import antlrGenerateFiles.ThrowingErrorListener;
import fileManagement.FolderManager;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
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

    /**
     * Controller
     * COnstructor for class
     * @param: Stage primaryStage
     * **/
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

    /**
     * initialize
     * Initializes the controller for the GUI.
     * @param: URL location, ResourceBundle resources
     * **/
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initiateDBM();
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

    /**
     * EventHandler
     * Shows a closeConfirm dialog to check if the user really wants to exit.
     * **/
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
            if(!disconnectMI.isDisable()){
                desconectar();
            }
        }
    };

    /**
     * conectar
     * Initializes disable values for the MenuItems in the GUI
     * **/
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

    /**
     * Method that checks if the path DATABASES exist, if not it creates the directory.
     */
    public void initiateDBM(){
        File theDir = new File("DATABASES");

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
            if (!result) {
                System.out.println("Error");
            }
        }
    }

    /**
     * Method desconectar set disable values of MenuItems to false so no action can be done.
     */
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

    /**
     * Refresh method, rebuilds the directory tree displayed in the TreeView
     */
    public void refresh(){
        String current ="";
        try {
            current = new File(".").getCanonicalPath() +"/DATABASES";
        } catch (java.io.IOException e ){

        }
        treeView.setRoot(getNodesForDirectory(new File(current)));
    }

    /**
     * loadQuerys method calls a FileChooser to import querys from a .txt or .sql file.
     */
    public void loadQuerys(){
        FileChooser fileChooser = new FileChooser();

        // Set extension filter
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TEXT files (*.txt)", "*.txt");
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

    /**
     * fontSize method displays a TextInputDialog so the user can introduce the desired fontSize for the TextAreas.
     */
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

    /**
     * errorDialog method show a Alert dialog that displays the message in text, and sets the header and window title.
     * @param title
     * @param header
     * @param text
     */
    public void errorDialog(String title, String header, String text) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(text);
        alert.showAndWait();
    }

    /**
     * run method executes the compilation method with the input of the CodeArea. Then refreshes the TreeView.
     */
    public void run(){
        eval.setError("");
        eval.log = "";
        textArea.setText("");
        String program = codeArea.getText();
        compile(program);
        eval.manejador.generateMetada();
        refresh();
    }

    /**
     * Executes the parsing and lexing process of the input given in expression and generates a parseTree and its tokens.
     * @param expression
     */
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
        }
    }


    /**
     * Initializes a fileChooser to select a directory and creates a .txt or .sql file in it.
     */
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

    /**
     * Writes a file with the content given in the file directory given.
     * @param content
     * @param file
     */
    private void SaveFile(String content, File file){
        try {
            FileWriter fileWriter;

            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException ex) {

        }

    }

    /**
     * Creates a buffer that readesthe content of a file and returns a String with its content.
     * @param file
     * @return Content of file
     */
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

    /**
     * Initializes and displays a new Scene of the about MenuItem.
     */
    public void about(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("aboutController.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Recursively calls and store the name of the children of a file directory.
     * @param directory
     * @return Generated root fot the TreeView
     */
    public TreeItem<String> getNodesForDirectory(File directory) { //Returns a TreeItem representation of the specified directory
        TreeItem<String> root = new TreeItem<String>(directory.getName(), new ImageView(dbIcon));
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
                    root.getChildren().add(new TreeItem<String>(f.getName(), new ImageView(textIcon)));
                }else {
                    root.getChildren().add(new TreeItem<String>(f.getName(), new ImageView(unkIcon)));
                }

            }
        }
        return root;
    }

    /**
     * Gets the file extension of a specific file.
     * @param file
     * @return String containing the extension of a file.
     */
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
}