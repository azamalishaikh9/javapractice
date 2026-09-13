package basic;

public class Test4 {
    public static void main(String[] args) {
        Emp e1 = new Emp(1, "John");
        Emp e2 = new Emp(2, "Tom");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (e1) {
                    System.out.println("Thread 1 : " + Thread.currentThread().getName());
                    synchronized (e2) {
                        System.out.println("Thread 2 : " + Thread.currentThread().getName());
                    }
                }
            }
        }, "t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (e2) {
                    System.out.println("Thread 2 : " + Thread.currentThread().getName());
                    synchronized (e1) {
                        System.out.println("Thread 1 : " + Thread.currentThread().getName());
                    }
                }
            }
        }, "t2");

        t1.start();
        t2.start();
    }
}

class Emp {
    int id;
    String name;

    Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

}

