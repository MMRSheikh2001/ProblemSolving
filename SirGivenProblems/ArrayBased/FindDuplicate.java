import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = { 23, 12, 54, 34, 87, 4, 56, 90, 65, 45, 12, 24, 34 };

        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            set.add(arr[i]);
        }

        for (Integer n : set) {
            list.remove(list.indexOf(n));
        }

        return list;
    }
}
