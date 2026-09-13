package array;

import java.util.Arrays;

public class CountNumbOccurrenceArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int x = 8;

        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
        System.out.println();

        int count = (int) Arrays.stream(arr).filter(num -> num == x).count();
        System.out.println("Number of occurrences of " + x + ": " + count);

        System.out.println("Number of Occurrence of " + x + " is " + countOccurrence(arr, x));
    }

    private static int countOccurrence(int[] arr, int x) {
        int res = 0;
        for (int j : arr) {
            if (x == j)
                res++;
        }
        return res;
    }
}

