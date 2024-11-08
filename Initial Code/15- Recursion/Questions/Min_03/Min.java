package Questions.Min_03;

public class Min {
    static int findMin(int[] nums) {
        if (nums.length <= 1) {
            return nums[0];
        }
        return helper(nums, nums[0], 1);
    }

    static int helper(int[] nums, int min, int index) {
        if (index == nums.length) {
            return min;
        }
        if (nums[index] < min) {
            return helper(nums, min = nums[index], index + 1);
        }
        return helper(nums, min, index + 1);
    }

    public static void main(String[] args) {
        int[] nums = { -1, -2, -3, 6, 7, -10 };
        System.out.println(findMin(nums));
    }
}
