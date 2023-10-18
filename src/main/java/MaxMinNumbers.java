import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Azam
 */
public class MaxMinNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 23, 24, 65, 76, -22);

        Integer maxNumbers = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();

        Integer minNumbers = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();

        System.out.println(maxNumbers + " " + minNumbers);
    }
}
