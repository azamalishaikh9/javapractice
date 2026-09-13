


package multithreading;

public class ThreadJoin extends Thread {

    public static void main(String[] args) {
        ThreadJoin th = new ThreadJoin();
        ThreadJoin th1 = new ThreadJoin();
        ThreadJoin th2 = new ThreadJoin();

        th.start();
        try {
            System.out.println("The current thread name is : " + Thread.currentThread().getName());
            th.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        th1.start();
        try {
            System.out.println("The current thread 1 name is : " + Thread.currentThread().getName());
            th1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        th2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(3000);
                System.out.println("Current thread name is : " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
















