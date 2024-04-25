package Question_From_Videos.Search_In_Rotated_Sorted_Array_II;

public class Rotated_Sorted_II {
    public boolean search(int[] nums, int target) {
        int pivot = pivotElement(nums);

        // if pivot not found just do normal search
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        // if not == -1 it means there are two ascending arrays
        if (nums[pivot] == target) {
            return true;
        }
        // if target > nums[0] is mean it will greater than the elements
        // exist after the pivot element
        // because after pivot element only exist element that smaller than pivot or
        // starting element
        // so there is no need to check after pivot
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        // if not greater then it will be smaller
        // if smaller than first element it means it exists after pivot
        // becuse after pivot there are smaller elements than the first element
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    // find the pivot element
    static int pivotElement(int[] nums) {
        int sp = 0;
        int ep = nums.length - 1;
        while (sp <= ep) {
            int mid = sp + (ep - sp) / 2;
            // elements after pivot will always less than the first element of array
            // if mid > mid + 1
            // it means that is the pivot element
            // because on the right side there are smaller
            // mid + 1 --> in smaller element part
            if (mid < ep && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            // if mid - 1 > mid reutrn mid - 1 as a ans
            // mid - 1 --> greater part of array
            if (mid > sp && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }

            // if elements at mid,start and end are equal skip these duplicates
            if (nums[mid] == sp && nums[mid] == nums[ep]) {
                // skip these duplicates
            }
        }
        return -1;
    }

    // search in first half before pivot
    static boolean binarySearch(int[] nums, int target, int sp, int ep) {

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
                return true;
            }

        }
        // if target not find in the array then return -1;
        return false;
    }
}
