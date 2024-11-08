package Notes.Notes_Code.Merge_Sort_04;

import java.util.Arrays;

public class In_Place_Merge_Sort {
    static void inPalceMergeSort(int[] nums, int s, int e) {
        if (s < e) {
            int mid = (s + e) / 2;
            // first sort the left part
            inPalceMergeSort(nums, s, mid);
            // now sort the right part
            inPalceMergeSort(nums, mid + 1, e);
            // after sorting merge those parts
            merge(nums, s, mid, e);
        }
    }

    private static void merge(int[] nums, int s, int mid, int e) {
        // first merge them into new array after that copy them into nums array
        int[] mix = new int[e - s + 1];
        int i = s;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= e) {
            if (nums[i] < nums[j]) {
                mix[k++] = nums[i++];
            } else {
                mix[k++] = nums[j++];
            }
        }

        // it might be case that elements will remaining
        // copy them into merge array
        while (i <= mid) {
            mix[k++] = nums[i++];
        }
        while (j <= e) {
            mix[k++] = nums[j++];
        }

        // now copy these elements into original array beacuse
        // are changing the position of particular elements
        for (int l = 0; l < mix.length; l++) {
            nums[s + l] = mix[l];
        }
    }

    public static void main(String[] args) {
        // int[] nums = { 9, 8, 6, 2, 5, 3, 7, 4 };
        int[] nums = { 9, 8, 6, 2, 5, 3, 7 };
        inPalceMergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
