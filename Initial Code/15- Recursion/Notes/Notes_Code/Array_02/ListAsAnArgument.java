package Notes.Notes_Code.Array_02;

import java.util.ArrayList;

public class ListAsAnArgument {
    static ArrayList<Integer> findAllIndex(int[] nums, int target, int index, ArrayList<Integer> list) {
        if (index == nums.length) {
            return list;
        }
        if (nums[index] == target) {
            list.add(index);
        }
        return findAllIndex(nums, target, index + 1, list);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 4, 8, 7 };
        ArrayList<Integer> list = findAllIndex(nums, 4, 0, new ArrayList<>());
        System.out.println(list);
    }
}
