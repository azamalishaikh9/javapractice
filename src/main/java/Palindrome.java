import java.util.Scanner;

/**
 * @author Azam
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String str = "racecar";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("Entered string is " + str + " palindrome " + reverse);
        } else {
            System.out.println("Entered string is not palindrome");
        }

    }
}
