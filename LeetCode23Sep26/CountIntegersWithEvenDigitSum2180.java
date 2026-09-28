public class CountIntegersWithEvenDigitSum2180 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int countEven(int num) {

        int count = 0;

        for (int i = 1; i <= num; i++) {

            long digitSum = 0;
            long s = i;
            while (s != 0) {
                long remain = s % 10;
                digitSum += remain;

                s = (s - remain) / 10;

            }

            if (digitSum % 2 == 0) {
                count++;
            }

        }

        return count;

    }
}