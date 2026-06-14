package java8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("maxBy: " + maxBy.apply(2, 3));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("minBy: " + minBy.apply(2, 3));
    }
}
