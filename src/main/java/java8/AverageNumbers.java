package java8;

import java.util.Arrays;
import java.util.List;

public class AverageNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 7);

        double average = numbers.stream()
                .mapToInt(i -> i) //using lambda reference
//                .mapToInt(Integer::intValue) //using method reference
                .average()
                .orElse(0.0);

        System.out.println(average); // 4.2
    }
}
