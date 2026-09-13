package pattern;

public class Pattern {
    public static void main(String[] args) {
        int i, j, row = 5;
        System.out.println("Pattern First");
        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("Pattern Second");
        for (i = 0; i < row; i++) {
            for (j = 2 * (row - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

