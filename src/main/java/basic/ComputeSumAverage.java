package basic;

/**
 * This class computes the sum and average of an array of integers.
 * It demonstrates basic array operations and arithmetic calculations.
 */
public class ComputeSumAverage {
    /**
     * The main method that demonstrates the computation of sum and average.
     */
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, -8, 12};

        // Initialize sum variable to 0
        int sum = 0;
        // Declare variable for average (double to handle decimal results)
        double average;

        // Print the incremented sum (this is an error - it's printing 1 instead of sum)
        System.out.println(++sum);

        // Iterate through the array and add each element to the sum
        for (int number : numbers) {
            sum += number;
        }

        // Get the length of the array
        int arrayLength = numbers.length;

        // Calculate the average by dividing sum by array length (cast to double)
        average = (double) (sum) / (double) (arrayLength);

        // Print the computed sum and average
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
    }
}
