public class PassThePillow2582 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int passThePillow(int n, int time) {
        int turn = time / (n - 1);

        if (turn % 2 == 0) {
            return 1 + time % (n - 1);

        }

        return n - time % (n - 1);

    }
}