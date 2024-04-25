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
            // if sp > mid
            // it is mean that all the element after mid and inlcude mid
            // will be always smaller than first so
            // goal is to find larger element
            // larger elements exist on the right side
            if (nums[sp] >= nums[mid]) {
                ep = mid - 1;
            }
            // [4,5,6,7]
            // start = 0;
            // end = 3;
            // mid = 1;
            // as nums[sp] >= nums[mid];
            // 4 >= 5 false
            // there is clear scenarion if nums[sp] >= nums[mid] == false
            // then my element exists on right side mean after mid
            // so we will increase start by mid + 1;
            else {
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
