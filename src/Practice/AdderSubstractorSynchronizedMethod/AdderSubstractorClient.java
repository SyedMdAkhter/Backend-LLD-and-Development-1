package Practice;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AdderSubstractorClient {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value = new Value();
        value.setVal(0);
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(value, lock);
        Substractor substractor = new Substractor(value, lock);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> futureAdded = executor.submit(adder);
        Future<Integer> futuresubstracted = executor.submit(substractor);
        futureAdded.get();
        futuresubstracted.get();

        System.out.println(value.getVal());



    }
}
