package Practice;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Substractor implements Callable<Integer> {
    private Value value;
    private Lock lock;
    public Substractor(Value value, Lock lock) {
        this.value = value;
        this.lock=lock;
    }
    @Override
    public Integer call() throws Exception {
        lock.lock();
        for(int i=1;i<=100;i++){
            lock.lock();
            System.out.println("substracting : "+i);
            value.setVal(value.getVal()-i);
            lock.unlock();
        }
        lock.unlock();
        return value.getVal();
    }
}
