package oops;

class Parent {
    void add(int x, int y) {
        System.out.println(x + y);
    }

    void add(float x, int y) {
        System.out.println(x + y);
    }

    void subtract(int x, long y) {
        System.out.println(x - y);
    }

//    void subtract(long x, int y){
//        System.out.println(x-y);
//    }

    void subtract(long x, long y) {
        System.out.println(x - y);
    }

    int multiplication(int x, int y) {
        return x * y;
    }

    double multiplication(double x, double y) {
        return x * y;
    }

}

public class OverrideExample {

    public static void main(String[] args) {
        int x = 1, y = 2;
        float z = 3.5F;
        Parent p = new Parent();
        OverrideExample or = new OverrideExample();
        System.out.println(or.multiplication(z, y));
        p.add(x, y);
        p.add(z, y);
        p.subtract(y, x);
        System.out.println(p.multiplication(z, z));
    }

    double multiplication(float x, int y) {
        return x * y;
    }
}

