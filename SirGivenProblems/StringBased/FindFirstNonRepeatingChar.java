

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingChar {
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatingChar("Md Mahbubur Rahman Sheikh"));
        System.out.println(findFirstNonRepeatingChar("Sabbir Hasan"));
    }

    public static char findFirstNonRepeatingChar(String s) {
        
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int count = map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i), count);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        char target = ' ';

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {

                target = s.charAt(i);
                break;
            }
        }

        return target;

    }
}
