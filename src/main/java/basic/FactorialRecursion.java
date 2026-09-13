package basic;

import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {
        System.out.println("Enter a number to get factorial :: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Factorial without recursion :: " + (number != 0 ? result : 0));
        System.out.println("Factorial of number is :: " + factorial(number));
    }

    private static int factorial(int number) {
        if (number != 0) {
            return number * factorial(number - 1);
        } else {
            return 1;
        }
    }
}

