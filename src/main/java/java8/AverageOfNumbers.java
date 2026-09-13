package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Azam
 */
public class AverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 7);

        double average = numbers.stream()
                .mapToInt(i -> i) //using lambda reference
//                .mapToInt(Integer::intValue) //using method reference
                .average()
                .orElse(0.0);

        double average2 = Stream.of(1, 3, 4, 6, 7)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        double average3 = numbers.stream().mapToDouble(e -> e).average().getAsDouble();

        System.out.println(average); // 4.2
        System.out.println(average2); //4.2
        System.out.println(average3); //4.2

    }
}
