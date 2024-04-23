package Question_From_Videos.Find_In_Mountain_Array;

public class Find_In_Mountain {
    /*
     * 1.) Find peak element
     * 2.) Search in Ascending Order OF Array till peak if element find then return
     * index.If it is not find then
     * 3.) Search in Descending Order of Array
     */
    static int search(int[] nums, int target) {
        int peak = peak(nums);
        if (nums[peak] == target) {
            return peak;
        }
        int ans = -1;
        ans = binarySearch(nums, target, 0, peak);
        if (ans != -1 /* it means element is found no need to seacrh in descending order */) {
            return ans;
        }

        return binarySearch(nums, target, peak + 1, nums.length - 1);
    }

    // find peak
    static int peak(int[] nums) {
        int sp = 0;
        int ep = nums.length - 1;
        while (sp < ep) {
            int mid = sp + (ep - sp) / 2;

            if (nums[mid] > nums[mid + 1]) {
                ep = mid;
            } else {
                sp = mid + 1;
            }
        }
        return sp;
    }

    // Seacrh in Ascending or either Descending
    static int binarySearch(int[] nums, int target, int sp, int ep) {
        boolean isAsc;
        if (nums[sp] < nums[ep])
            isAsc = true;
        else
            isAsc = false;
        while (sp <= ep) {
            int mid = sp + (ep - sp) / 2;

            // the common in both order that they always return mid
            if (nums[mid] == target) {
                return mid;
            }

            // now for ascending and descending order
            if (isAsc) {
                if (target > nums[mid]) {
                    sp = mid + 1;
                } else {
                    ep = mid - 1;
                }
            } else {
                if (target > nums[mid]) {
                    ep = mid - 1;
                } else {
                    sp = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 4, 3, 2, 1 };
        System.out.println(search(nums, 3));
    }
}
