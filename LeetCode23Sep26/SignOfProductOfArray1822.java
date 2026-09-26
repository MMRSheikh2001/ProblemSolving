public class SignOfProductOfArray1822 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int arraySign(int[] nums) {

        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            product *= signFunc(nums[i]);
        }

        return product;

    }

    private static int signFunc(long x) {
        if (x < 0) {
            return -1;
        } else if (x > 0) {
            return 1;
        }
        return 0;
    }
}
