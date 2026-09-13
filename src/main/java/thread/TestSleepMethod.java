package thread;

public class TestSleepMethod extends Thread {
    public static void main(String[] args) {
        TestSleepMethod tsm = new TestSleepMethod();
        TestSleepMethod tsm1 = new TestSleepMethod();

        tsm.start();
        tsm1.start();
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
