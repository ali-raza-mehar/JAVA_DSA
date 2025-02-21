package Notes.Notes_Code.Pattern_And_Buuble_Selection_Sort_03;

import java.util.Arrays;

public class Selection_Sort {
    static void sort(int[] nums, int lastIndex) {
        if (lastIndex == 0) {
            return;
        }
        int maxIndex = getMaxIndex(nums, 0, lastIndex);
        int temp = nums[maxIndex];
        nums[maxIndex] = nums[lastIndex];
        nums[lastIndex] = temp;
        sort(nums, lastIndex - 1);
    }

    static int getMaxIndex(int[] nums, int start, int lastIndex) {
        int maxIndex = 0;
        for (int i = start; i <= lastIndex; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // full recursive approach

    static void fullRecursive(int[] arr, int max, int i, int j, int lastIndex) {
        if (i == arr.length) {
            return;
        }

        if (j <= lastIndex) {
            if (arr[j] > arr[max]) {
                max = j;
            }
            fullRecursive(arr, max, i, j + 1, lastIndex);
        } else {
            int temp = arr[max];
            arr[max] = arr[lastIndex];
            arr[lastIndex] = temp;
            fullRecursive(arr, max = 0, i + 1, j = 1, lastIndex - 1);
        }

    }

    public static void main(String[] args) {
        int[] nums = { 5, 10, 3, 2, 1 };
        // int[] nums = { 5, 10, 7, 30, 8 };
        fullRecursive(nums, 0, 0, 1, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
