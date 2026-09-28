import java.util.ArrayList;
import java.util.List;

public class AverageValueOfEvenNumbersDivisibleByThree2455 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int averageValue(int[] nums) {
        long sum = 0;
        long count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 6 == 0) {
                sum += nums[i];
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }

        return (int) (sum / count);

    }
}