package Question_From_Videos.Search_In_Rotated_Sorted_Array_II;

public class Rotated_Sorted_II {
    static int findMin(int[] nums) {
        int pivot = pivotElement(nums);

        // if pivot not found just do normal search
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
            if (nums[mid] == nums[sp] && nums[mid] == nums[ep]) {
                // skip these duplicates
                // Note: before skip might be possible that start and end can be pivot
                if (sp < ep && nums[sp] > nums[sp + 1]) {
                    return sp;
                }
                // if not simple increment
                sp++;
                // also check ep
                if (ep > sp && nums[ep] < nums[ep - 1]) {
                    return ep - 1;
                }
                ep--;
            }
            // life side is sorted so pivot should be in right
            // example for this condition is above ---> nums[mid] == nums[sp] && nums[mid] >
            // nums[ep]
            // {3,3,3,3,3,7,1,1,1} --> nums[mid] == nums[s] && nums[mid] > nums[e]
            // {3,4,5,6,7,8,3,3,3} --> nums[sp] < nums[mid]
            else if (nums[sp] < nums[mid] || nums[mid] == nums[sp] && nums[mid] > nums[ep]) {
                sp = mid + 1;
            } else {
                ep = mid - 1;
            }
        }
        return -1;
    }

    // search in first half before pivot
    static int binarySearch(int[] nums, int sp, int ep) {

        while (sp < ep) {
            /*
             * might be possible that (sp + ep) this thing can exceed the range of int in
             * java so --> sp + (ep - sp) / 2; is better to use in place of (sp + ep) / 2;
             */
            int mid = sp + (ep - sp) / 2;

            if (nums[mid] <= nums[mid + 1]) {
                ep = mid;
            }
        }
        return nums[sp];
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 1, 2, 1, 1, 13, 1, 1, 1, 1 };
        // int[] nums = { 1, 1, 2, 13, 1, 1, 1, 1, 2, 2 };
        // int[] nums = { 3, 1, 3, };
        // int[] nums = { 1, 3, 5 };
        int[] nums = { 1 };
        // int[] nums = { 3, 3, 3, 3, 3, 3, 3, 3, 1, 3 };
        System.out.println(findMin(nums));
    }
}