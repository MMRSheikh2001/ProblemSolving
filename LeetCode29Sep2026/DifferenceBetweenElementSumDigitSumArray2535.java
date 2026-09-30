public class DifferenceBetweenElementSumDigitSumArray2535 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int differenceOfSum(int[] nums) {
        long sum = 0;
        long digitSum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            int num = nums[i];
            while (num != 0) {
                int remain = num % 10;
                digitSum += remain;
                num = (num - remain) / 10;

            }

        }
        if (digitSum > sum) {
            return (int) (digitSum - sum);
        }

        return (int) (sum - digitSum);
    }
}