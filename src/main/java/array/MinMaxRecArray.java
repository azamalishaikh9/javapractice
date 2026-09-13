package array;

public class MinMaxRecArray {

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, -50, 10, 2};
        System.out.println("Min Rec  " + findMinRec(arr, arr.length));

        System.out.println("Max Rec  " + findMaxRec(arr, arr.length));
    }

    private static int findMinRec(int[] arr, int length) {
        if (length == 1) {
            return arr[0];
        }

        return Math.min(arr[length - 1], findMinRec(arr, length - 1));
    }

    private static int findMaxRec(int[] arr, int length) {
        if (length == 1) {
            return arr[0];
        }

        return Math.max(arr[length - 1], findMaxRec(arr, length - 1));
    }
}

