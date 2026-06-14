package java8;

import java.util.Arrays;
import java.util.List;

public class EvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double a, b, c;

        a = 3.0 / 0;
        b = 0 / 4.0;
        c = 0 / 0.0;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Even Numbers
        numbers.stream().filter(num -> num % 2 == 0).forEach(num -> System.out.print(num + " "));

        System.out.println(" ");


        //Odd Numbers
        numbers.stream().filter(num -> num % 2 == 1).forEach(num -> System.out.print(num + " "));
    }
}
