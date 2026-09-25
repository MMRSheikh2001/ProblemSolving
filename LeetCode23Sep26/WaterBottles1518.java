public class WaterBottles1518 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numWaterBottles(9, 3));

    }
}

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int steps = 0;
        int remainingEmpty = 0;
        while (numBottles != 0) {

            steps += numBottles;

            int emptyBottles = numBottles + remainingEmpty;

            numBottles = 0;

            remainingEmpty = emptyBottles % numExchange;
            numBottles = (emptyBottles - remainingEmpty) / numExchange;

        }
        return steps;

    }
}