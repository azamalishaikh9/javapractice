package array;

public class ZerosInArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0};
        int n = arr.length;
        int x = firstZeroIndex(arr, n);
        if (x == -1) {
            System.out.println("Count of zero is 0");
        } else {
            System.out.println("Count of zero is ");
            System.out.println(n - x);
        }
    }

    private static int firstZeroIndex(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}

