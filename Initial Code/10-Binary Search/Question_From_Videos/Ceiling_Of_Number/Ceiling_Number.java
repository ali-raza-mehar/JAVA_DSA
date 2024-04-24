package Question_From_Videos.Ceiling_Of_Number;

public class Ceiling_Number {
    static int ceilingNumber(int[] nums, int target) {
        // ceiling --> smallest element greater than or eqaul to target
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
        if (sp < nums.length) {
            return nums[sp];
        }
        /* if sp greater than length it means ceiling of target number does not exist */
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 9, 14, 16, 18 };
        System.out.println(ceilingNumber(nums, 20));
    }
}
