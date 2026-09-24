public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 7, 12, 23, 34, 45, 67, 89, 90 };

        System.out.println(linearSearch(arr, 23));
        System.out.println(linearSearch(arr, 100));

    }

    private static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
