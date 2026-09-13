package pattern;

import java.util.Scanner;

public class ABCSqrPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Uppercase");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
        System.out.println("Lowercase");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print((char) (j + 96) + " ");
            }
            System.out.println();
        }
    }
}
