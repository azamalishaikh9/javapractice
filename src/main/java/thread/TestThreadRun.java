package thread;

public class TestThreadRun extends Thread {

    public static void main(String[] args) {
        TestThreadRun t1 = new TestThreadRun();
        t1.run();
    }

    @Override
    public void run() {
        System.out.println("Thread running.");
    }
}
