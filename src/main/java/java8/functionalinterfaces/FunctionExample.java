package java8.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> function1 = String::toUpperCase;

    static Function<String, String> function2 = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println("Result is : " + function.apply("java8"));
        System.out.println("Result using Lambda is : " + function1.apply("java8"));
        System.out.println("Result using and or Lambda is : " + function.andThen(function2).apply("java8"));
        System.out.println("Result using compose Lambda is : " + function.compose(function2).apply("java8"));
    }
}
