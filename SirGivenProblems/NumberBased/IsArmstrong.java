public class IsArmstrong {
    public static void main(String[] args) {

        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(140));
    }

    public static boolean isArmstrong(int num) {

        int sum = 0;
        int original = num;

        String s = original + "";
        int len = s.length();

        while (num != 0) {
            int remain = num % 10;
            sum = sum + (int) Math.pow(remain, len);

            num = num - remain;
            num = num / 10;

        }

        return original == sum;

    }
}
