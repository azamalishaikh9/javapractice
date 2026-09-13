package thread;

public class ThreadPriority extends Thread {

    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        System.out.println("Thread 1 : " + tp1.getPriority());
        System.out.println("Thread 2 : " + tp2.getPriority());
        System.out.println("Thread 3 : " + tp3.getPriority());

        tp1.setPriority(6);
        tp2.setPriority(3);
        tp3.setPriority(9);

        System.out.println("Thread 1 : " + tp1.getPriority());
        System.out.println("Thread 2 : " + tp2.getPriority());
        System.out.println("Thread 3 : " + tp3.getPriority());

        System.out.println("Currently executing thread : " + Thread.currentThread().getName());
        System.out.println("Currently executing thread : " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);

        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());

    }

    @Override
    public void run() {
        System.out.println("Inside the run() body");
    }
}
