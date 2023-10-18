import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Azam
 */
public class NumberStartsWith {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 23, 24, 65, 76, -22);

        List<Integer> startsWith = numbers.stream()
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        List<Integer> startsWith1 = numbers.stream()
                .map(String::valueOf)
                .filter(e -> e.startsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        List<Integer> startsWith2 = numbers.stream()
                .map(String::valueOf)
                .filter(e -> e.startsWith("2") || e.startsWith("-2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(startsWith);
        System.out.println(startsWith1);
        System.out.println(startsWith2);
    }
}
