import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Azam
 */
public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 23, 24, 65, 76, -22, 23, 1, 76);

        Set<Integer> duplicated = numbers.stream()
                .filter(e -> Collections.frequency(numbers, e) > 1)
                .collect(Collectors.toSet());

        Set<Integer> duplicateNum = new HashSet<>();
        Set<Integer> duplicated1 = numbers.stream()
                .filter(e -> !duplicateNum.add(e))
                .collect(Collectors.toSet());

        System.out.println(duplicated);

        System.out.println(duplicated1);
    }
}
