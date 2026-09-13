package multithreading;

public class TestThreadRun1 extends Thread {

    public static void main(String[] args) {
        TestThreadRun1 t1 = new TestThreadRun1();
        t1.run();
        t1.run();
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println();
            }
        }
    }
}

