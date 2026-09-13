package string;

import java.util.Scanner;

public class Palindrome1 {

    private static boolean isPalindrome(String input) {
        if (input == null) return false;
        String normalized = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0, right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return !normalized.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number or String : ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " is a Palindrome Number or String");
        } else {
            System.out.println(input + " is not a Palindrome Number or String");
        }
    }


}

