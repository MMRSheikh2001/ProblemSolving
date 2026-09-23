public class UniqueIntegerSumZero1304 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] sumZero(int n) {

        int[] arr = new int[n];

        int start = 0;
        int end = n - 1;
        int num = 1;
        while (start < end) {

            
            arr[start] = num;
            arr[end] = -num;
            num++;
            start++;
            end--;

            if (start == end) {
                arr[start] = 0;
            }

        }

        return arr;

    }
}