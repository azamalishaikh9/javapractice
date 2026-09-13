package string;

import java.util.Scanner;

public class Palindrome2 {

    public static void main(String[] args) {
        String original;
        StringBuilder reverse = new StringBuilder();
        System.out.println("Enter a String or Number to check :");
        Scanner sc = new Scanner(System.in);
        original = sc.nextLine();
        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse.append(original.charAt(i));
        }

        if (original.equalsIgnoreCase(reverse.toString())) {
            System.out.println("Original String/Number " + original + " is a palindrome " + reverse);
        } else {
            System.out.println("Original String/Number " + original + " is not a palindrome " + reverse);
        }
        sc.close();

    }
}

