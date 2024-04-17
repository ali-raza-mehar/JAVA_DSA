package Assignments.Medium.houseRobber;

public class HouseRobber {
    static int rob(int[] nums) {
        if (nums.length < 2)
            return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < dp.length; i++) {
            int lootOfcurrentHouse = nums[i];
            int maxlootExceptCurrent = dp[i - 1];
            int maxLootIncludingCurrent = dp[i - 2];
            dp[i] = Math.max(lootOfcurrentHouse + maxLootIncludingCurrent, maxlootExceptCurrent);
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        // int[] array = { 1, 3, 1, 3, 100 };
        int[] array = { 2, 7, 9, 3, 1 };
        System.out.println(rob(array));
    }
}
