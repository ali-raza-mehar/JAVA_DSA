package Notes.Notes_Code.Pattern_And_Buuble_Selection_Sort_03;

import java.util.Arrays;

public class Bubble_Sort {
    // static boolean isSwaping = false;

    static void sort(int[] nums, int i, int j, int ep) {
        if (i == nums.length) {
            return;
        }
        if (j < ep - i - 1) {
            if (nums[j] > nums[j + 1]) {
                swap(nums, j, j + 1);
                // isSwaping = true;
            }
            sort(nums, i, j + 1, ep);
        } else {
            // if (!isSwaping) {
            // return;
            // }
            sort(nums, i + 1, j = 0, ep);
        }
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        // int[] nums = { 5, 4, 3, 2, 1 };
        // int[] nums = { 5, 4, 3, 2 };
        // int[] nums = { 5, 4, 3, };
        // int[] nums = { 5, 4 };
        // int[] nums = { 5 };
        // int[] nums = { 5, 1, 3, 2 };
        int[] nums = { 1, 1, 3, 2 };
        sort(nums, 0, 0, nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
