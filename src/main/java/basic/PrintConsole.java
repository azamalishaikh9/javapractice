package basic;

import java.util.Arrays;

public class PrintConsole {
    public static void main(String[] args) {
        System.out.println("Welcome ");
        System.err.println("Error ");

        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = arr.clone();

        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(Arrays.copyOf(arr, arr.length)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 1, 4)));
    }
}

