package java8;

import java.util.Arrays;
import java.util.List;

public class ConcatString {

    public static void main(String[] args) {
        String[] countries = {null, "Australia", "India", "America", "Malaysia", "Peru"};

        List<String> countriesList = Arrays.stream(countries)
                .filter(e -> e != null && e.startsWith("A"))
                .map(e -> "AA" + e) //start of the string
//                .map(e -> e + "AA") //end of the string
                .toList();

        System.out.println(countriesList); //AAAustralia, AAAmerica
    }


}
