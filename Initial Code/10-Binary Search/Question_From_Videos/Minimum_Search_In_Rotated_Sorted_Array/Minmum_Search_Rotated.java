package Question_From_Videos.Minimum_Search_In_Rotated_Sorted_Array;

public class Minmum_Search_Rotated {
    static int findMin(int[] nums) {
        int pivot = pivotElement(nums);
        int min1, min2;
        min1 = binarySearch(nums, 0, pivot);
        if (pivot + 1 > nums.length - 1) {
            return min1;
        }
        min2 = binarySearch(nums, pivot + 1, nums.length - 1);
        if (min1 < min2) {
            return min1;
        }
        return min2;
    }

    // find the pivot element
    static int pivotElement(int[] nums) {
        int sp = 0;
        int ep = nums.length - 1;
        while (sp < ep /* beacuse in the end sp and ep will point toward the max elemnt */) {
            int mid = sp + (ep - sp) / 2;
            // elements after pivot will always less than the first element of array
            if (nums[0] > nums[mid]) {
                // if less it means my pivot exists before lesser elements
                ep = mid - 1;
            } else if (nums[mid] > nums[mid + 1]) {
                ep = mid;
            } else {
                sp = mid + 1;
            }
        }
        return sp;
    }

    // search in first half before pivot
    static int binarySearch(int[] nums, int sp, int ep) {

        while (sp < ep) {
            /*
             * might be possible that (sp + ep) this thing can exceed the range of int in
             * java so --> sp + (ep - sp) / 2; is better to use in place of (sp + ep) / 2;
             */
            int mid = sp + (ep - sp) / 2;

            if (nums[mid] < nums[mid + 1]) {
                ep = mid;
            }

        }
        // if target not find in the array then return -1;
        return nums[sp];
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 1, 2 };
        // int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        // int[] nums = { 11, 13, 15, 17 };
        System.out.println(findMin(nums));
    }
}
