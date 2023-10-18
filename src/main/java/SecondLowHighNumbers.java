import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Azam
 */
public class SecondLowHighNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 23, 65, 24, 76, -22);

        Integer secondHigh = numbers.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println(secondHigh);

        Integer secondHigh2 = numbers.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();

        System.out.println(secondHigh2);

        Integer secondLow = numbers.stream().sorted().distinct().skip(1).findFirst().get();

        System.out.println("Ajam"+10+20);

        System.out.println(secondLow);
    }
}
