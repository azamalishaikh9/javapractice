package java8;

import java.util.Arrays;
import java.util.List;

public class CountLengthOfString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("this", "is", "a", "small", "list");

//        String minCharString = list.stream().min(Comparator.comparingInt(String::length)).get();

//        String maxCharString = list.stream().max(Comparator.comparingInt(String::length)).get();

//       using single iterator
        String[] result = list.stream()
                .collect(
                        () -> new String[]{null, null}, //Supplier for the result array
                        (arr, str) -> { //Accumulator
                            if (arr[0] == null || str.length() < arr[0].length()) arr[0] = str; //Min
                            if (arr[1] == null || str.length() > arr[1].length()) arr[1] = str; //Max
                        },
                        (arr1, arr2) -> { // Combiner
                            if (arr1[0] == null || (arr2[0] != null && arr2[0].length() < arr1[0].length()))
                                arr1[0] = arr2[0];
                            if (arr1[1] == null || (arr2[1] != null && arr2[1].length() > arr1[1].length()))
                                arr1[1] = arr2[1];
                        });

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
