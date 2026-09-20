public class FactorialOfNumber {
    public static void main(String[] args) {

        System.out.println(findFactorial(5));
    }

    public static long findFactorial(int num) {
        long multi = 1;

        for (int i = 1; i <= num; i++) {
            multi *= i;
        }
        return multi;
    }
}
