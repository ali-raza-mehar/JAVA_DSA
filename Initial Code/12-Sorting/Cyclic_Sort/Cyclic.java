package Cyclic_Sort;

import java.util.Arrays;

public class Cyclic {

    static void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else
                i++;
        }

        i = 0;
        while (i < nums.length) {
            if (i + 1 != nums[i]) {
                System.out.print(i + 1 + " ");
            }
            i++;
        }
        System.out.println();
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 1, 1, 5, 1, };
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
