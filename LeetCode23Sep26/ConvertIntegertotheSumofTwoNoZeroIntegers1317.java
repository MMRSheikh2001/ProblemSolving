public class ConvertIntegertotheSumofTwoNoZeroIntegers1317 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];
        int b = 1;

        int a = n - b;

        String sa = a + "";
        String sb = b + "";
        while (sa.contains("0") || sb.contains("0")) {
            b++;
            a = n - b;
            sa = a + "";
            sb = b + "";

        }

        arr[0] = a;
        arr[1] = b;

        return arr;
    }
}