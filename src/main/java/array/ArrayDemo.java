package array;

import java.util.Arrays;

/**
 * This class demonstrates the usage of 2D arrays in Java.
 * It creates a 2D array with uneven row lengths and prints it using different methods.
 */
public class ArrayDemo {
    /**
     * The main method to demonstrate 2D array operations.
     */
    public static void main(String[] args) {
        // Create a 2D array with uneven row lengths
        int[][] arr = {
                {1, 2, 3},  // Row 0
                {4, 5, 6},  // Row 1
                {7}         // Row 2
        };

        // Print the 2D array using Arrays.deepToString() for a readable format
        System.out.println(Arrays.deepToString(arr));

        // Print the 2D array using nested loops to display elements in row-major order
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
