package api.recodecamp.compile_service.catalog.category;

public class Comment {

    String statement;

    public Comment() {

    }

    public String getStatement() {
        return statement;
    };

    public void setStatement(String statement) {
        this.statement = statement;
    };

    public String genStatement() {
        return String.format("%s", "");
    }

}
