
package Question_From_Videos.Floor_Of_Number;

public class Floor_Number {
    static int floorNumber(int[] nums, int target) {
        // floor --> largest element less than or eqaul to target

        if (nums.length == 0) {
            return 0;
        }
        int sp = 0;
        int ep = nums.length - 1;
        while (sp <= ep) {
            int mid = sp + (ep - sp) / 2;

            if (target > nums[mid]) {
                sp = mid + 1;
            } else if (target < nums[mid]) {
                ep = mid - 1;
            } else
                return nums[mid];
        }
        if (ep > 0) {
            return nums[ep];
        }
        /*
         * if ep is positive it means ceiling of target number exists.
         * if ep is negative and the negative index does not exist so it means floor
         * does not exist.
         */
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 9, 14, 16, 18 };
        System.out.println(floorNumber(nums, 1));
    }
}