
package Bubble_Sort;

import java.util.Arrays;

public class bubble {

    static void sort(int[] nums) {
        int n = nums.length;
        boolean swaped;
        // check swaped for ith pass
        // if there is no swap in any ith swap
        // then break the loop
        for (int i = 0; i < n; i++) {
            swaped = false;
            for (int j = 1; j < n - i; j++) {
                if (nums[j - 1] > nums[j]) {
                    swap(nums, j - 1, j);
                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }
        }
        // return nums;
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 4 };
        int[] nums = { 5, 1, 3, 2 };
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}