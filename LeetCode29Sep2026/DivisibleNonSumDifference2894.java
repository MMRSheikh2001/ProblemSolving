public class DivisibleNonSumDifference2894 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int differenceOfSums(int n, int m) {

        long num1 = 0;
        long num2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }

        return (int) (num1 - num2);

    }
}