/**
 * @author Azam
 */
public class Factorial {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        int i, fact = 1, number = 5;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + number + " is " + fact);
        System.out.println("Using Recursion");
        System.out.println("Factorial of " + number + " is " + factorial(number));

    }
}
