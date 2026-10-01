public class SumMultiples2652 {
    public static void main(String[] args) {

    }

}

class Solution {
    public int sumOfMultiples(int n) {

        long sum = 0;

        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return (int) sum;

    }
}