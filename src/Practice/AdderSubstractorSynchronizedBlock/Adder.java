package Practice;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Integer>{
    private Value value;
    private Lock lock;
    Adder(Value value, Lock lock){
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Integer call() throws Exception {
        //lock.lock();
        for(int i =1;i<=100;i++){
            lock.lock();
            System.out.println("Adding : "+i);
            value.setVal(value.getVal()+i);
            lock.unlock();
        }
        //lock.unlock();

        return value.getVal();

    }



}
