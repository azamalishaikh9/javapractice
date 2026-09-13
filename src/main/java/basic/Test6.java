package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test6 {

    public static void main(String[] args) {
//        System.out.println("Hello");

        String[] str = new String[]{"a", "b"};

        // Employee {id, name, salary}
        Map<Integer, String> hm = new HashMap<>();

        hm.put(1, "1#Nilesh#2000");
        hm.put(2, "2#ABC#2000");
        hm.put(3, "3#PQR#3000");
        hm.put(4, "4#AAA#3000");
        hm.put(5, "5#BBB#5000");

        List<String> list = Arrays.stream(str).map(String::toUpperCase).toList();

        System.out.println(list);
        List<Integer> salary = new ArrayList<>();

        salary.add(2000);
        salary.add(2000);
        salary.add(3000);
        salary.add(3000);
        salary.add(5000);

        Map<Integer, Long> count = salary.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(count);

    }

}

