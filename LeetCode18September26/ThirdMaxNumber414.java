import java.util.ArrayList;

import java.util.List;

import java.util.TreeSet;

public class ThirdMaxNumber414 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i : nums) {
            set.add(i);
        }
        if (set.size() <= 2) {
            return set.last();
        }
        List<Integer> list = new ArrayList<>(set);
        return list.get(list.size() - 3);

    }
}