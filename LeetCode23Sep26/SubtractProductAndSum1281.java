public class SubtractProductAndSum1281 {
    public static void main(String[] args) {

    }

}

class Solution {
    public int subtractProductAndSum(int n) {

        long product = 1;
        long sum = 0;

        while (n != 0) {
            int remain = n % 10;
            product *= remain;
            sum += remain;

            n -= remain;
            n /= 10;

        }

        return (int) (product - sum);

    }
}