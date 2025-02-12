package DesignPatternPractice;

public class EagerLoadingExampl {
    private static EagerLoadingExampl instance = new EagerLoadingExampl();
    private String url;
    private String username;
    private String password;
    private String port;
    private EagerLoadingExampl() {
        this.url = "jdbc:oracle:thin:@localhost:1521:orcl";
        this.username = "orcl";
        this.password = "orcl";
        this.port = "1521";
    }
    public static EagerLoadingExampl getInstance() {
        return instance;
    }
}
