package thread;

public class DaemonThread extends Thread {
    public static void main(String[] args) {
        DaemonThread dt = new DaemonThread();
        DaemonThread dt1 = new DaemonThread();
        DaemonThread dt2 = new DaemonThread();

        dt.setDaemon(true);
        dt.start();
        dt1.start();
        dt2.start();
    }

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Thread is Daemon : ==> ");
        } else {
            System.out.println("User thread work : =>");
        }
    }
}
