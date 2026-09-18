import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros283 {
    public static void main(String[] args) {

        int[] arr = { 12, 0, 3, 2, 4 };

        Solution.moveZeroes(arr);
    }
}

class Solution {
    public static void moveZeroes(int[] nums) {
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[position] = nums[i];
                position++;
            }
        }

        for (int i = position; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
}