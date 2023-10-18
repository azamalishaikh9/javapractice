/**
 * @author Azam
 */
public class ArrayIntoSubArray {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 8, 6, 7, 3, 5, 6, 5};
        int splitSize = 3;

        int[][] splitedArray = splitArray(numbers, splitSize);
        printSubArray(splitedArray);
    }

    private static void printSubArray(int[][] splitedArray) {
        for(int[] subArray : splitedArray){
            if(subArray == null){
                break;
            }
            System.out.print("[ ");
            for(int num: subArray){
                System.out.print(num + " ");
            }
            System.out.println("]");
        }
    }

    private static int[][] splitArray(int[] numbers, int splitSize) {
        int sizeOfArray = (int) Math.ceil((double) numbers.length / splitSize);

        int[][] subArrays = new int[sizeOfArray][];

        int subArrayIndex = 0;
        int currentSubArraySize = 0;
        for (int num : numbers) {
            if (currentSubArraySize == 0 || currentSubArraySize >= 3) {
                subArrays[subArrayIndex] = new int[Math.min(3, numbers.length - subArrayIndex * 3)];
                currentSubArraySize = 0;
            }

            subArrays[subArrayIndex][currentSubArraySize] = num;
            currentSubArraySize++;
            if(currentSubArraySize == 3){
                subArrayIndex++;
            }
        }
        return subArrays;
    }


}
