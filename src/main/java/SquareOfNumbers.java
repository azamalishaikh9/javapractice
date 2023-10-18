import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Azam
 */
public class SquareOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 10, 20, 30, 15);

        Double squareOfNumbers = numbers.stream()
                .map(e -> e * e)
                .filter(e -> e > 100)
                .mapToInt(e -> e)
                .average()
                .getAsDouble();

        System.out.println(squareOfNumbers);
    }
}
