
public class IsPalindrome {

    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String s) {

        String newString = "";
        for (int i = s.length() - 1; i <= 0; i--) {

            newString = newString + s.charAt(i);
        }

        return s.equals(newString);

    }

}
