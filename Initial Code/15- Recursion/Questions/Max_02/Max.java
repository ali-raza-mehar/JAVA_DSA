package Questions.Max_02;

public class Max {
    static int max(int[] nums) {
        if (nums.length <= 1) {
            return nums[0];
        }
        return helper(nums, nums[0], 1);
    }

    static int helper(int[] nums, int max, int index) {
        if (index == nums.length) {
            return max;
        }
        if (nums[index] > max) {
            return helper(nums, max = nums[index], index + 1);
        }
        return helper(nums, max, index + 1);
    }

    public static void main(String[] args) {
        int[] nums = { -1, -2, -3 };
        System.out.println(max(nums));
    }
}
