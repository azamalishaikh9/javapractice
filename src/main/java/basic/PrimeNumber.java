package basic;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int number, flag = 0;
        System.out.println("Enter a number to check : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int m = number / 2;

        if (number == 0 || number == 1) {
            System.out.println(number + " is not a Prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a Prime number");
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(number + " is a Prime number");
            }
        }

        sc.close();
    }
}

