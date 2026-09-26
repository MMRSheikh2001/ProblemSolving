public class SignOfProductOfArray1822 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int arraySign(int[] nums) {

        long product = 1;

        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
        }

        return signFunc(product);

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
