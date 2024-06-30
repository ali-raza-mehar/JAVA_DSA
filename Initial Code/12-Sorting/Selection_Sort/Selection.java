package Selection_Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Selection {

    static void sort(int[] nums) {
        int n = nums.length;
        int lastIndex = n - 1;
        for (int i = 0; i < n; i++) {
            int maxIndex = getMaxIndex(nums, 0, lastIndex);
            swap(nums, lastIndex, maxIndex);
            lastIndex--;
        }
    }

    static int getMaxIndex(int[] nums, int start, int end) {
        int maxIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 64, 25, 12, 22, 11 };
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
