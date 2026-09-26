public class LargestOddNumberInString1903 {
    public static void main(String[] args) {

    }
}

class Solution {
    public String largestOddNumber(String num) {

        String max = "";
        long largest = Integer.MIN_VALUE - 1;

        for (int i = 0; i < num.length(); i++) {
            int a = num.charAt(i) - '0';

            if (a % 2 == 1 && a > largest) {
                largest = a;

            }

        }

        if (largest == Integer.MIN_VALUE - 1) {
            return "";
        }

        return max + largest;

    }
}