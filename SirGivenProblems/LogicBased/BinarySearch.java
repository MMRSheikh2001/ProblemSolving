public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 7, 12, 23, 34, 45, 67, 89, 90 };

        System.out.println(binarySearch(arr, 23));
        System.out.println(binarySearch(arr, 100));

    }

    private static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return -1;

    }

}
