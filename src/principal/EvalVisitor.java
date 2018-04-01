package principal;

import antlrGenerateFiles.PostSQLBaseVisitor;
import antlrGenerateFiles.PostSQLParser;
import fileManagement.Manejador;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import java.util.ArrayList;
import java.util.Optional;

public class EvalVisitor extends PostSQLBaseVisitor<String>{

    public Manejador manejador  = new Manejador("master");
    public String error = "";
    public String log = "";
    public String verbose = "";
    public boolean verboseEnable =  false;

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String  visitInitProgramVerbose(PostSQLParser.InitProgramVerboseContext ctx) {
        verboseEnable = true;
        System.out.println("Se activo la opcion de Verbose");
        return visitChildren(ctx);
    }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitSTMcreateDB(PostSQLParser.STMcreateDBContext ctx) {
        String id = ctx.ID().getText();
        ArrayList<String> nombres = manejador.getDbsNames();
        if(!nombres.contains(id)){
            manejador.createDataBase(id);
            log += "Database \""+ctx.ID().getText()+"\" has been created succesfully!.\n";
            if(verboseEnable){
                verbose += "Base de Datos: " + id + ", creado con exito\n";
            }
        }
        else {
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\" database already exists.\n";
        }
        return visitChildren(ctx);

    }

    /**
     * Grammar: DROP DATABASE ID
     * Metodo para la eliminacion de una base de datos.**/
    @Override public String visitSTMdropDB(PostSQLParser.STMdropDBContext ctx) {
        String id = ctx.ID().getText();
        ArrayList<String> nombres = manejador.getDbsNames();
        if(nombres.contains(id)){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("User Confirmation");
            alert.setHeaderText("Drop \""+ctx.ID().getText()+"\" database?");
            alert.setContentText("Choose your option.");
            ButtonType buttonTypeOne = new ButtonType("Yes");
            ButtonType buttonTypeCancel = new ButtonType("No");
            alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeCancel);
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == buttonTypeOne){
                // ... user chose "Drop"
                manejador.dropDatabase(id);
                log += "Database \""+ctx.ID().getText()+"\" has been dropped succesfully!.\n";
                if(verboseEnable){ verbose += "Base de Datos: " + id + ", eliminada con exito\n";}
            }

        }
        else {
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\" database not found.\n";
        }
        return visitChildren(ctx);
    }

    /***
     * Grammar: ALTER DATABASE ID RENAME TO ID*/
    @Override public String visitSTMalterDB(PostSQLParser.STMalterDBContext ctx) {
        String idViejo = ctx.ID(0).getText();
        String idNuevo = ctx.ID(1).getText();

        if (!manejador.getDbsNames().contains(idViejo)){
            //ERROR: No existe la base de datos inicial
            return error = "Error en la linea:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                    ". La base de datos " + ctx.ID(0).getText()+" no existe.\n";
        }

        else if(manejador.getDbsNames().contains(idNuevo)){
            //Error
            return error = "Error en la linea:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                    ". El nombre  " + ctx.ID(1).getText()+" ya existe .\n";
        }

        else{
            manejador.changeDBSname(idViejo, idNuevo);
            if(verboseEnable){
                return verbose += "Base de Datos: " + ctx.ID(0).getText() + " renombrada a " + ctx.ID(1).getText() +
                        "con exito\n";
            }
        }

        return visitChildren(ctx);


    }


    @Override public String visitSTMcreateTable(PostSQLParser.STMcreateTableContext ctx) {

        return visitChildren(ctx);
    }

    public void inicarDB(){


    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}