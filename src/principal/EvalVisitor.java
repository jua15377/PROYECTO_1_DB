package principal;

import antlrGenerateFiles.PostSQLBaseVisitor;
import antlrGenerateFiles.PostSQLParser;

public class EvalVisitor extends PostSQLBaseVisitor<String>{

    public String error = "";

    @Override public String visitSTMcreateDB(PostSQLParser.STMcreateDBContext ctx) {
        System.out.println(ctx.ID().getText());
        return visitChildren(ctx);
    }

    @Override public String visitSTMdropDB(PostSQLParser.STMdropDBContext ctx) {
        System.out.println( ctx.ID().getText());
        return visitChildren(ctx);
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
