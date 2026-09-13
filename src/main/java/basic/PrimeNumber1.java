package basic;

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        System.out.println("Enter a number to check is Prime or Not : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        System.out.println(isPrime(number) ? (number + " is prime") : (number + " not Prime"));

    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % 2 == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

