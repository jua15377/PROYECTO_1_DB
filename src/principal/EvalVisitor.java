package principal;

import antlrGenerateFiles.*;
import fileManagement.*;

public class EvalVisitor extends PostSQLBaseVisitor<String>{

    public String error = "";

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
