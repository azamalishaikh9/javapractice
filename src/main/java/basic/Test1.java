package basic;

public class Test1 {
    public static void main(String[] args) {
        int x = 5;
        pass(x);
        System.out.print(" main x=" + x);
    }

    private static void pass(int x) {
        System.out.print(" doStuff x=" + x++);
    }


}

