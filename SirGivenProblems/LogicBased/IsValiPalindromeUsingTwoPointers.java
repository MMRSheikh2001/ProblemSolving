public class IsValiPalindromeUsingTwoPointers {
    public static void main(String[] args) {
        System.out.println(isValiPalindromeUsingTwoPointers("Mahbub"));
        System.out.println(isValiPalindromeUsingTwoPointers("abccba"));

    }

    public static boolean isValiPalindromeUsingTwoPointers(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;

    }
}
