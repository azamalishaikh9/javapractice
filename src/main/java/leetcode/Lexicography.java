package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Lexicography {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> total = new ArrayList<>();

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i <= s.length() - 1; i++) {
            try {
                String sort = s.substring(i, k + i);
                total.add(sort);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            sort(total);
            smallest = total.getFirst();
            largest = total.getLast();
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));

    }
}
