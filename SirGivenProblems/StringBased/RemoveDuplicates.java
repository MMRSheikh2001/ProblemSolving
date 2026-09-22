import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("Mahbubur Rahman"));
    }

    public static String removeDuplicates(String s) {
        String duplicatesRemoved = "";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {

                duplicatesRemoved = duplicatesRemoved + s.charAt(i);
                set.add(s.charAt(i));
            }
        }
        return duplicatesRemoved;
    }
}
