import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 23, 12, 54, 34, 87, 4, 56, 90, 65, 45, 12, 24, 34 };

        System.out.println(Arrays.toString(bubbleSort(arr)));

    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        return arr;
    }
}
