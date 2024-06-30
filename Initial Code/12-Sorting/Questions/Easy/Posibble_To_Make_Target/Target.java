package Questions.Easy.Posibble_To_Make_Target;

import java.util.Arrays;

public class Target {
    static boolean canBeEqual(int[] target, int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target[i])
                return false;
        }

        return true;

    }

    public static void main(String[] args) {
        int[] nums = { 392, 360 };
        int[] target = { 392, 360 };
        System.out.println(canBeEqual(target, nums));
    }
}
