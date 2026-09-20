public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(131));
        System.out.println(isPalindrome(213));

    }

    public static boolean isPalindrome(int num) {

        int newNum = 0;
        int s = num;

        while (num != 0) {
            int remainer = num % 10;
            newNum = 10 * newNum + remainer;
            num = num - remainer;
            num = num / 10;

        }

        return newNum == s;

    }
}
