public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 23, 12, 54, 34, 87, 4, 56, 90, 65, 45, 12, 24, 34 };

        System.out.println(findSecondLargestElement(arr));

    }

    public static int findSecondLargestElement(int[] arr) {

        int max = arr[0];
        int second = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (second < arr[i]) {

                if (arr[i] < max) {
                    second = arr[i];
                }
            }
        }

        return second;
    }
}
