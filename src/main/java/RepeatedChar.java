import java.util.HashMap;

/**
 * @author Azam
 */
public class RepeatedChar {

    public static void main(String[] args) {
        String str = "Helloo";
        System.out.println(getRepeatedCount(str));
    }

    static char getRepeatedCount(String str) {
        int count = 0;
        char answer  = 0;
        String ans = "";

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            hm.put(c, hm.getOrDefault(c,0) + 1);

            if(count < hm.get(c)){
                answer = c;
                count = hm.get(c);
            }
        }
        return answer;
    }
}
