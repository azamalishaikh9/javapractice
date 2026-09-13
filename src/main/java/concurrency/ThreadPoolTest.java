package concurrency;

import multithreading.WorkerThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            ex.execute(worker);
        }

        ex.shutdown();
        while (!ex.isTerminated()) {
        }

        System.out.println("Finishes all threads");
    }
}

