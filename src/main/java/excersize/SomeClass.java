package excersize;

public class SomeClass {
    // main method
    public static void main(String[] args) {
        meth1(null);
    }

    public static void meth1(Object o) {
        System.out.println("Object method is getting Invoked.");
    }

    public static void meth1(String str) {
        System.out.println("String method is getting Invoked.");
    }

}
