import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Azam
 */
public class CountMaxCharString {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("this","is","a","small","list");

        String minCharString = list.stream().min(Comparator.comparingInt(String::length)).get();

        String maxCharString = list.stream().max(Comparator.comparingInt(String::length)).get();

        System.out.println(minCharString);
        System.out.println(maxCharString);

    }
}
