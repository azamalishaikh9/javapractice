package excersize;

public class JTPProblem {
    JTPProblem(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
    }

    JTPProblem(int a, float b) {
        System.out.println("a = " + a + " b = " + b);
    }

    // main method
    public static void main(String[] args) {
        // the two print statements
        System.out.println(0.2 == 0.1 * 2);
        System.out.println(0.3 == 0.1 * 3);

        System.out.println(Math.min(0.0d, Double.MIN_VALUE));

        Integer n1 = 2000, n2 = 2000;
        System.out.println(n1 == n2); // the first print statement
        Integer n3 = 10, n4 = 10;
        System.out.println(n3 == n4); // the second print statement

        System.out.println(10 + 20 + "Javatpoint"); //30Javatpoint
        System.out.println("Javatpoint" + 10 + 20); //Javatpoint1020

        System.out.println(10 * 20 + "Javatpoint"); //200Javatpoint
        System.out.println("Javatpoint" + 10 * 20); //Javatpoint200

        System.out.println(1.0 / 0.0); //Infinity

        byte a = 10;
        byte b = 15;
        JTPProblem test = new JTPProblem(a, b);

    }
}