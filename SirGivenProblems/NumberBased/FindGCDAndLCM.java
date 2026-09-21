public class FindGCDAndLCM {
    public static void main(String[] args) {

        System.out.println(findGCD(6, 12));
        System.out.println(findLCM(12, 15));
    }

    public static int findGCD(int a, int b) {
        int gcd = 1;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
            if (i == b) {
                break;
            }

        }
        return gcd;

    }

    public static int findLCM(int a, int b) {
        int lcm = b;
        for (int i = 1; i <= a; i++) {

            if (lcm % a == 0) {
                break;
            } else {
                lcm = b * i;

            }

        }
        return lcm;

    }

}
