package assignment8_week11.no3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    public static void main(String[] args){
        ExecutorService es = Executors.newSingleThreadExecutor();

        Service threadA = new Service("ThreadA", 1, 10);
        Service threadB = new Service("ThreadB", 11, 20);

        es.execute(threadA);
        es.execute(threadB);

        es.shutdown();
    }
}
