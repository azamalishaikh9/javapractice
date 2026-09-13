package basic;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestP {
    public static void main(String[] args) {
//        1,2,3,4,5,1,3,1,4 //remove duplicated

        List<String> collect = Stream.of("1", "2", "3", "4", "5", "1", "3", "1", "4")
                .distinct()
                .toList();

        System.out.println(collect);

        Map<String, Long> collect1 = Stream.of("1", "2", "3", "4", "5", "1", "3", "1", "4")
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));

        System.out.println(collect1);

//        try {
//
//        } catch(RuntimeException rex) {
//        } catch(NullPointerException nullpe) {
//        }

        String a = new String("World");
        String b = "World";

        System.out.println(a.equals(b));
        System.out.println(a == b);

//        what is equals() & hashcode()
//        functional Interfaces
//        Comparator & comparable
//        partitioning in kafka
//        data hiding
//         same beans autowired @Qualifier & Primary
    }
}

