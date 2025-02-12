package DesignPatternPractice;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DoubleCheckLocking {
    private static DoubleCheckLocking instance = null;
    private String url;
    private String username;
    private String password;
    private String port;
    private DoubleCheckLocking() {
        this.url = "jdbc:oracle:thin:@localhost:1521:orcl";
        this.username = "orcl";
        this.password = "orcl";
        this.port = "1521";
    }
    public static DoubleCheckLocking getInstance() {
        if (instance == null) {
            Lock lock = new ReentrantLock();
            lock.lock();
            if (instance == null) {
                instance = new DoubleCheckLocking();
            }
            lock.unlock();
        }
        return instance;
    }
}
