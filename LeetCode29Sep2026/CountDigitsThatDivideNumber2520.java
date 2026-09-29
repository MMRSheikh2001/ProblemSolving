public class CountDigitsThatDivideNumber2520 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int countDigits(int num) {
        int s = num;
        int count = 0;

        while (s != 0) {

            int remain = s % 10;
            if (num % remain == 0) {
                count++;
            }
            s = (s - remain) / 10;

        }

        return count;

    }
}