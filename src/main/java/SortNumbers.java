import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Azam
 */
public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 23, 65, 24, 76, -22);

        List<Integer> sortNumbers = numbers.stream().sorted().collect(Collectors.toList());

        List<Integer> reverseSortNumbers = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println(sortNumbers);
        System.out.println(reverseSortNumbers);
    }
}
