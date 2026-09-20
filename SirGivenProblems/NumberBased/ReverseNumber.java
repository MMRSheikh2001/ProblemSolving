public class ReverseNumber {
    public static void main(String[] args) {

        System.out.println(reverseNumber(1498));
    }

    public static int reverseNumber(int num) {
        long newNum = 0;

        while (num != 0) {
            int remain = num % 10;
            newNum = newNum * 10 + remain;
            num = (num - remain) / 10;

        }

        return (int) newNum;
    }
}
