import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * @author Azam
 */
public class AverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 7);

        Double average = numbers.stream().mapToDouble(e -> e).average().getAsDouble();

        System.out.println(average);
    }
}
