package basic;

public class C2 {
    public static void method() {
        System.out.println("Printing from C2");
    }

    public static void main(String[] args) {

        C1.method();
        method();
    }
}

