import java.util.List;

public class CountVowelsAndConsonents {
    public static void main(String[] args) {

    }

    public static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase().trim();
        List<Character> list = List.of('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public static int countConsonents(String s) {
        s = s.toLowerCase().trim();

        int count = 0;
        List<Character> list = List.of('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't',
                'v', 'w', 'x', 'y', 'z');

        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}
