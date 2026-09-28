public class NumberOfCommonDivisors2427 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int commonFactors(int a, int b) {

        int count = 0;
        for (int i = 1; i <= a; i++) {

            if (i > b) {
                break;
            }

            if (a % i == 0 && b % i == 0) {
                count++;
            }

        }

        return count;

    }
}