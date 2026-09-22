import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IsAnagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("Mahbub", "Sabbir"));

    }

    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            list.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            if (list.contains(s2.charAt(i))) {

                list.remove(list.indexOf(s2.charAt(i)));
            }
        }

        return list.isEmpty();
    }
}
