package pattern;

import java.util.Scanner;

public class StarMultiplyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Print the pattern for n=5 (as shown in the requirement)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print '*' if on main diagonal (i == j) or anti-diagonal (i + j == n-1)
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
