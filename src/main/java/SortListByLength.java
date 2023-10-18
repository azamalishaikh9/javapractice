import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Azam
 */
public class SortListByLength {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("this","is","a","list");

        List<String> strings = list.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());

        System.out.println(strings);
    }
}
