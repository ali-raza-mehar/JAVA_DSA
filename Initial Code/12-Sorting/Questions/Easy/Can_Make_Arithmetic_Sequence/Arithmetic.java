package Questions.Easy.Can_Make_Arithmetic_Sequence;

import java.util.Arrays;

public class Arithmetic {
    static boolean canMakeArithmeticProgression(int[] nums) {
        Arrays.sort(nums);

        int diff = nums[1] - nums[0];

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] != diff)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 13, 12, -12, 9, 9, 16, 7, -10, -20, 0, 18, -1, -20, -10, -8, 15, 15, 16, 2, 15 };
        System.out.println(canMakeArithmeticProgression(nums));
    }
}
