package multithreading;

public class Multi extends Thread {

    public static void main(String[] args) {

        Multi m = new Multi();
        m.start();

    }

    @Override
    public void run() {
        System.out.println("Thread start");
    }
}

