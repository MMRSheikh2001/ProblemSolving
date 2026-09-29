public class FindPivotInteger2485 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int pivotInteger(int n) {
        int pivot = -1;

        for (int i = 1; i <= n; i++) {
            int sumPivot = 0;
            int sum = 0;

            for (int j = 1; j <= i; j++) {
                sumPivot += j;
            }
            for (int j = i; j <= n; j++) {
                sum += j;
            }

            if (sum == sumPivot) {
                return i;
            }

        }

        return pivot;

    }
}