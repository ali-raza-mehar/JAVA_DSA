package Notes.Notes_Code.Quick_Sort_05;

import java.util.Arrays;
// i will looking for greater element than pivot
// j will looking for smaller element than pivot

//s stops at elements greater than or equal to the pivot.
// e stops at elements less than or equal to the pivot.
public class QuickSort {
    public static void main(String[] args) {
        // int[] arr = { 5, 4, 3, 2, 1 };
        int[] arr = { 10, 80, 30, 90, 40, 50, 70 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        // Arrays.sort(arr);
    }

    static void sort(int[] nums, int low, int hi) {
        if (low > hi) {
            return;
        }

        int i = low;
        int j = hi;
        int m = i + (j - i) / 2;
        int pivot = nums[m];

        // when I become greater than the pivot than
        // partitiong is done
        while (i <= j) {

            // also a reason why if its already sorted it will not swap
            while (nums[i] < pivot) {
                i++;
            }
            while (nums[j] > pivot) {
                j--;
            }
            // swap their positions whose element greater than or equal to pivot
            if (i <= j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        sort(nums, low, j);
        sort(nums, i, hi);
    }
}
