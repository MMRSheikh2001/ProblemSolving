import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = { 23, 12, 54, 34, 87, 4, 56, 90, 65, 45, 12, 24, 34 };

        int[] nums = { 231, 123, 4, 343, 87, 24, 56, 97, 65, 45, 32, 24, 34 };

        System.out.println(Arrays.toString(mergeTwoSortedArrays(arr, nums)));
    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {

        int[] arr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length + i] = arr2[i];
        }

        Arrays.sort(arr);

        return arr;

    }
}
