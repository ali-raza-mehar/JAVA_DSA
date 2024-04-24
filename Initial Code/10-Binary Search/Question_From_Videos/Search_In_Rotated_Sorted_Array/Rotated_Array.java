package Question_From_Videos.Search_In_Rotated_Sorted_Array;

public class Rotated_Array {
    static int search(int[] nums, int target) {
        int pivot = pivotElement(nums);

        // if pivot not found just do normal search
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        // if not == -1 it means there are two ascending arrays
        if (nums[pivot] == target) {
            return nums[pivot];
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);

    }

    // find the pivot element
    static int pivotElement(int[] nums) {
        int sp = 0;
        int ep = nums.length - 1;
        while (sp <= ep /* beacuse in the end sp and ep will point toward the max elemnt */) {
            int mid = sp + (ep - sp) / 2;
            // elements after pivot will always less than the first element of array
            if (mid < ep && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > sp && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }

            if (nums[sp] >= nums[mid]) {
                ep = mid - 1;
            } else {
                sp = mid + 1;
            }
        }
        return -1;
    }

    // search in first half before pivot
    static int binarySearch(int[] nums, int target, int sp, int ep) {

        while (sp <= ep) {
            /*
             * might be possible that (sp + ep) this thing can exceed the range of int in
             * java so --> sp + (ep - sp) / 2; is better to use in place of (sp + ep) / 2;
             */
            int mid = sp + (ep - sp) / 2;

            if (target > nums[mid]) {
                sp = mid + 1;
            } else if (target < nums[mid]) {
                ep = mid - 1;
            } // if target not greater or less than mid than it can be only equal to target
            else {
                return mid;
            }

        }
        // if target not find in the array then return -1;
        return -1;
    }

    public static void main(String[] args) {
        // int[] Array = { 5, 1 };
        // int[] Array = { 11, 13, 15, 17 };
        // int[] Array = { 3, 3, 3, 3, 1 };
        // int[] Array = { 4, 5, 6, 7, 0, 1, 2 };
        int[] Array = { 15, 16, 19, 20, 30, 2, 3, 4, 8, 12 };
        // int[] Array = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        // 1, 1 };
        System.out.println(search(Array, 4));
    }

}
