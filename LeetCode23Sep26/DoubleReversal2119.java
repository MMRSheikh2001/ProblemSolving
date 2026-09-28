public class DoubleReversal2119 {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean isSameAfterReversals(int num) {

        long s = num;

        long reversed1 = 0;

        while (s != 0) {
            long remain = s % 10;
            reversed1 = reversed1 * 10 + remain;

            s = (s - remain) / 10;

        }

        long reversed2 = 0;
        s = reversed1;

        while (s != 0) {

            long remain = s % 10;

            reversed2 = reversed2 * 10 + remain;

            s = (s - remain) / 10;

        }

        return num == reversed2;

    }
}