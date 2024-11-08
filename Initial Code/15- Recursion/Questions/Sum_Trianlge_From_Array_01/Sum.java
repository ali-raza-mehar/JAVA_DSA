package Questions.Sum_Trianlge_From_Array_01;

import java.util.Arrays;

public class Sum {

    static void allTrianlges(int[] nums) {
        if (nums.length < 1) {
            return;
        }
        int[] arr = helper(nums, 0, new int[nums.length - 1]);
        allTrianlges(arr);
        System.out.println(Arrays.toString(nums));
    }

    static int[] helper(int[] nums, int index, int[] result) {
        if (index == result.length) {
            return result;
        }
        result[index] = nums[index] + nums[index + 1];
        return helper(nums, index + 1, result);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        allTrianlges(nums);
    }
}
