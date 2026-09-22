import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = { 23, 12, 54, 34, 87, 4, 56, 90, 65, 45 };
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    public static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            arr[start] = arr[start] + arr[end];

            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];

            start++;
            end--;

        }
        return arr;
    }
}
