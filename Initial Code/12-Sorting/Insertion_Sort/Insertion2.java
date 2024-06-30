package Insertion_Sort;

import java.util.Arrays;

public class Insertion2 {

    static void sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                } else
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 5, 2, 4, 6, 1, };
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
