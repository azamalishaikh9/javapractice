import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Azam
 */
public class EvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 7);

        List<Integer> evenNumbers = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> oddNumbers = numbers.stream()
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);
        System.out.println(oddNumbers);

    }
}
