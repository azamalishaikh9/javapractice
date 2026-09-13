package array;

import java.util.Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] a = {1, 423, 6, 46, 34, 23, 13, 53, 4};

        Arrays.sort(a);

        System.out.println("min - " + a[0] + " max - " + a[a.length - 1]);

        System.out.println("Minimum Number : " + getMin(a, a.length));

        System.out.println("Maximum Number : " + getMax(a, a.length));
    }

    private static int getMax(int[] a, int length) {
        int res = a[0];
        for (int i = 1; i < length; i++) {
            res = Math.max(res, a[i]);
        }
        return res;
    }

    private static int getMin(int[] a, int length) {
        int res = a[0];
        for (int i = 1; i < length; i++) {
            res = Math.min(res, a[i]);
        }
        return res;
    }
}

