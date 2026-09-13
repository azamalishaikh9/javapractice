package thread;

public class MainThread implements Runnable {

    public static void main(String[] args) {
        Runnable r1 = new MainThread();

        Thread t1 = new Thread(r1, "My New Thread");

        t1.start();

        String str = t1.getName();
        System.out.println(str);
    }

    @Override
    public void run() {
        System.out.println("Now the thread running...");
    }
}
