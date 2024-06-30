package Cyclic_Sort;

import java.util.Arrays;

public class Duplicate {
    static int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int correctPosition = nums[i] - 1;
            if (nums[i] != nums[correctPosition])
                swap(nums, i, correctPosition);
            else
                i++;
        }

        i = 0;
        while (i < n) {
            if (i + 1 != nums[i])
                return nums[i];
            i++;
        }
        return i;
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(nums));

    }
}
