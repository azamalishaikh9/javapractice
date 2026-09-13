package multithreading;


class ThreadName extends Thread {
    ThreadName(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("The thread is executing...");
    }
}

public class NamingThread1 {

    public static void main(String[] args) {
        ThreadName tn = new ThreadName("TH-1");
        ThreadName tn1 = new ThreadName("TH-2");

        System.out.println("Thread 1 : " + tn.getName());
        System.out.println("Thread 2 : " + tn1.getName());

        tn.start();
        tn1.start();
    }
}

