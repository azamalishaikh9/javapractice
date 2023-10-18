import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Azam
 */
public class ConcatString {

    public static void main(String[] args) {
        String[] countries = {null,"Australia","India", "America", "Malaysia", "Peru"};
        List<String> input = Arrays.asList(countries);

        List<String> strings = input.stream().filter(e -> e!=null && e.startsWith("A")).map(e -> e.concat("AA")).collect(Collectors.toList());

        System.out.println(strings);
    }


}
