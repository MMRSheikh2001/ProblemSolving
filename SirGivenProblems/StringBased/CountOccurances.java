import java.util.HashMap;
import java.util.Map;

public class CountOccurances {
    public static void main(String[] args) {
        System.out.println(countOccurance("Md Mahbubur Rahman Sheikh"));
        System.out.println(countOccurance("Sabbir Hasan"));

    }

    public static Map<Character, Integer> countOccurance(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int count = map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i), count);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        return map;
    }
}
