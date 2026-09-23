public class FindMissingNumber {
    public static void main(String[] args) {

        int[] arr = { 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16 };
        System.out.println(findMissingNumber(arr));

    }

    public static int findMissingNumber(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int expectedSum = 0;

        for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
            expectedSum += i;
        }

        return expectedSum - sum;

    }
}
