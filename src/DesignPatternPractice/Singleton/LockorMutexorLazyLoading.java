package DesignPatternPractice;

public class LockorMutexorLazyLoading {
    private static LockorMutexorLazyLoading instance = null;
    private String url;
    private String username;
    private String password;
    private String port;
    private LockorMutexorLazyLoading() {
        this.url = "jdbc:oracle:thin:@localhost:1521:orcl";
        this.username = "orcl";
        this.password = "orcl";
        this.port = "1521";
    }
    public synchronized static LockorMutexorLazyLoading getInstance() {
        if (instance == null) {
            instance = new LockorMutexorLazyLoading();
        }
        return instance;
    }
    //slow performance
}
