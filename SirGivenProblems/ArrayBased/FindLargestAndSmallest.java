public class FindLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = { 23, 12, 54, 34, 87, 4, 56, 90, 65, 45 };
        System.out.println(findLargest(arr));
        System.out.println(findSmallest(arr));

    }

    public static int findLargest(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findSmallest(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }
}
