package multithreading;

public class NamingThread extends Thread {

    public static void main(String[] args) {
        NamingThread nm = new NamingThread();
        NamingThread nm1 = new NamingThread();

        System.out.println("Name of the thread1 : " + nm.getName());
        System.out.println("Name of the thread2 : " + nm1.getName());

        nm.start();
        nm1.start();

        nm.setName("NM THREAD");
        System.out.println("Changed thread name : " + nm.getName());

    }

    @Override
    public void run() {
        System.out.println("Running...");
    }
}

