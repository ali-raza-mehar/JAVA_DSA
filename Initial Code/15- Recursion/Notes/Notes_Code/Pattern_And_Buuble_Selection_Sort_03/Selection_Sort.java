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

    public static void main(String[] args) {
        // int[] nums = { 5, 10, 3, 2, 1 };
        int[] nums = { 5, 10, 7, 30, 8 };
        sort(nums, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
