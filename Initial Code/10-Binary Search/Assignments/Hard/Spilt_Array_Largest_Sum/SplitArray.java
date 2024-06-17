package Assignments.Hard.Spilt_Array_Largest_Sum;

import java.util.Arrays;

public class SplitArray {

    static int splitArray(int[] nums, int k) {
        if (k > nums.length) {
            return -1;
        }
        int start = Arrays.stream(nums).max().getAsInt();
        int end = Arrays.stream(nums).sum();

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int painter = countPainters(nums, mid);
            if (painter <= k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int countPainters(int[] nums, int allowedPaints) {
        int painter = 0;
        int unitCounts = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + unitCounts <= allowedPaints) {
                unitCounts += nums[i];
            } else {
                painter++;
                unitCounts = nums[i];
            }
        }
        return ++painter;
    }

    public static void main(String[] args) {
        // System.out.println(splitArray(new int[] { 7, 2, 5, 10, 8 }, 2));
        // System.out.println(splitArray(new int[] { 1, 2, 3, 4, 5 }, 2));
        // System.out.println(splitArray(new int[] { 1, 2, 3, 4 }, 3));
        System.out.println(splitArray(new int[] { 1, 1, 2 }, 2));
    }
}
