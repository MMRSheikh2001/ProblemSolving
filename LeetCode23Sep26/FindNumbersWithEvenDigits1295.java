public class FindNumbersWithEvenDigits1295 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int n : nums) {
            String s = n + "";
            if (s.length() % 2 == 0) {
                count++;
            }

        }

        return count;

    }
}