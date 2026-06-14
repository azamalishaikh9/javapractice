package java8.functionalinterfaces;

public class FunctionExample1 {

    public static String performConcat(String str) {
        return FunctionExample.function2.apply(str);
    }

    public static void main(String[] args) {
        String result = performConcat("Hello");

        System.out.println("Result: " + result);
    }
}
