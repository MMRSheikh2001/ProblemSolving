import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = { 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 11, 13, 12, 14, 10, 12, 13, 14, 15, 16 };

        System.out.println(Arrays.toString(removeDuplicates(arr)));

    }

    private static int[] removeDuplicates(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!list.contains(arr[i])) {

                list.add(arr[i]);
            }

        }

        arr = new int[list.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
