import java.util.Arrays;

public class RotateArrayByKPosition {
    public static void main(String[] args) {

        int[] arr = { 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 11, 13, 12, 14, 10, 12, 13, 14, 15, 16 };

        System.out.println(Arrays.toString(rotateArrayByKPosition(arr, 5)));

    }

    private static int[] rotateArrayByKPosition(int[] arr, int k) {
        k = k % arr.length;

        int[] toBack = new int[arr.length - k];
        int[] front = new int[k];

        for (int i = 0; i < arr.length - k; i++) {
            toBack[i] = arr[i];
        }

        for (int i = 0; i < front.length; i++) {
            front[i] = arr[arr.length - k + i];
        }

        for (int i = 0; i < front.length; i++) {
            arr[i] = front[i];
        }

        for (int i = 0; i < toBack.length; i++) {
            arr[i + front.length] = toBack[i];
        }

        return arr;
    }

}
