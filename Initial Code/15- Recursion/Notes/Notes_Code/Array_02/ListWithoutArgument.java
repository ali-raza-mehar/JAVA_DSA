package Notes.Notes_Code.Array_02;

import java.util.ArrayList;

public class ListWithoutArgument {
    static ArrayList<Integer> findAllIndex(int[] nums, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == nums.length) {
            return list;
        }
        if (nums[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFrombelowCalls = findAllIndex(nums, target, index + 1);
        list.addAll(ansFrombelowCalls);
        return list;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 4, 8, 9 };
        ArrayList<Integer> list = findAllIndex(nums, 4, 0);
        System.out.println(list);
    }
}
