import java.util.Arrays;
import java.util.List;

/**
 * @author Azam
 */
public class SumOfNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 7);

        Integer sum = numbers.stream().reduce((a, b) -> a + b).get();
        Integer sum1 = numbers.stream().reduce(Integer::sum).get();

        System.out.println(sum + " " + sum1);
    }
}
