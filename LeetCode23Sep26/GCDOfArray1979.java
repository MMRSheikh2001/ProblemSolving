public class GCDOfArray1979 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int findGCD(int[] nums) {

        int smallest = nums[0];
        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (smallest > nums[i]) {
                smallest = nums[i];

            }
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }

        int gcd = 1;

        for (int i = 2; i <= smallest; i++) {
            if (smallest % i == 0 && largest % i == 0) {
                gcd = i;
            }
        }

        return gcd;

    }
}