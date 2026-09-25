public class CountOddNumbersInInterval1523 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int countOdds(int low, int high) {
        int range = high - low + 1;
        int count = 0;

        if (range % 2 == 0) {
            count = range / 2;

        } else {
            if (low % 2 == 0) {
                count = (range - 1) / 2;
            } else {
                count = (range + 1) / 2;
            }

        }
        return count;

    }
}
