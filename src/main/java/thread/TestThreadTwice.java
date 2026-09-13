package thread;

public class TestThreadTwice extends Thread {

    public static void main(String[] args) {
        TestThreadTwice t1 = new TestThreadTwice();

        t1.start();
        t1.start();
    }

    @Override
    public void run() {
        System.out.println("Thread running.");
    }
}
