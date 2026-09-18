public class CountPrimes204 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int countPrimes(int n) {
        long count = 0;

        for (int i = 2; i < n; i++) {
            long countb = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    countb++;
                }
            }
            if (countb == 0) {
                count++;
            }

        }

        return (int) count;

    }
}