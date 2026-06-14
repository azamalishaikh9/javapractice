package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InterviewQuestions {

    public static void main(String[] args) {

        /* Find 1st Repeated char */
        String str = "Java stream API is very good.";

        Character key = str.chars().mapToObj(ch -> (char) ch).filter(ch -> ch != ' ').collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1).findFirst().get().getKey();

        System.out.println(key.toString());

        /* Find string starts with specific letter */
        String fruits = "apple banana orange beet anjir mango";

        List<String> fruitList = Arrays.stream(fruits.split(" ")).filter(fruit -> fruit.startsWith("a")).toList();

        System.out.println(fruitList);

        /* Print Prime numbers using Stream */
        IntStream.rangeClosed(1, 100)
                .filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0))
                .forEach(System.out::println);

    }
}
