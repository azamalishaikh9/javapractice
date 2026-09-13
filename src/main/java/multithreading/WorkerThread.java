package multithreading;

public class WorkerThread implements Runnable {

    private String message;

    public WorkerThread(String msg) {
        this.message = msg;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + " (End)");
    }

    private void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}

