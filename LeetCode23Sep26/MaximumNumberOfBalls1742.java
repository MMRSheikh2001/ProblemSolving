import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalls1742 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int countBalls(int lowLimit, int highLimit) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = lowLimit; i <= highLimit; i++) {
            int sumDigit = 0;
            int num = i;
            while (num != 0) {
                int remain = num % 10;
                sumDigit += remain;
                num = (num - remain) / 10;

            }

            if (!map.containsKey(sumDigit)) {

                map.put(sumDigit, 1);
            } else {
                int count = map.get(sumDigit) + 1;
                map.put(sumDigit, count);
            }
        }

        return Collections.max(map.values());

    }
}