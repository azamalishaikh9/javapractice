package concurrency;

import multithreading.Tasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest1 {
    public static int MAX_TH = 3;

    public static void main(String[] args) {
        Runnable rb1 = new Tasks("task 1");
        Runnable rb2 = new Tasks("task 2");
        Runnable rb3 = new Tasks("task 3");
        Runnable rb4 = new Tasks("task 4");
        Runnable rb5 = new Tasks("task 5");

        ExecutorService es = Executors.newFixedThreadPool(MAX_TH);

        es.execute(rb1);
        es.execute(rb2);
        es.execute(rb3);
        es.execute(rb4);
        es.execute(rb5);

        es.shutdown();
    }
}

