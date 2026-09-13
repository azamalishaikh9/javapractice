package java8;

import java.security.PrivilegedAction;

public class LambdaExpressions {

    public static void main(String[] args) {
        Runnable runnable = () -> {
        };
        PrivilegedAction<String> stringPrivilegedAction = () -> "Raoul";
        PrivilegedAction<String> stringPrivilegedAction1 = () -> {
            return "Mario";
        };
//        Function<Integer, Integer> integerIntegerFunction = (Integer i) -> return 30 + i;
        System.out.println("Lambda 1 : " + runnable);
        System.out.println("Lambda 2 : " + stringPrivilegedAction);
        System.out.println("Lambda 3 : " + stringPrivilegedAction1);
    }
}

