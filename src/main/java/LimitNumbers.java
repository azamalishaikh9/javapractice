import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Azam
 */
public class LimitNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 23, 65, 24, 76, -22);

        List<Integer> limitNumbers = numbers.stream().limit(3).collect(Collectors.toList());

        System.out.println(limitNumbers);

        Integer sumLimitNumbers = numbers.stream().limit(3).reduce((p, q) -> p + q).get();

        System.out.println(sumLimitNumbers);

        List<Integer> skipNumbers = numbers.stream().skip(3).collect(Collectors.toList());

        System.out.println(skipNumbers);

        Integer skipSumNumbers = numbers.stream().skip(3).reduce(Integer::sum).get();

        System.out.println(skipSumNumbers);
    }
}
