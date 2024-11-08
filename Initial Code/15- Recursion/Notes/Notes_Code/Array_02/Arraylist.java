package Notes.Notes_Code.Array_02;

import java.util.ArrayList;

public class Arraylist {

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] nums, int target, int index) {
        if (index == nums.length) {
            return;
        }
        if (nums[index] == target) {
            list.add(index);
        }
        findAllIndex(nums, target, index + 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 4, 8, 7 };
        findAllIndex(nums, 4, 0);
        System.out.println(list);
    }

}