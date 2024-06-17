package Assignments;

public class Negative_Count_In_Descending_Order {
    static int count(int[] nums) {
        if (nums[0] > 0 && nums[nums.length - 1] > 0) {
            return 0;
        }
        if (nums[0] < 0 && nums[nums.length - 1] < 0) {
            return nums.length;
        }

        int firstNegIndex = 0;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < 0) {
                firstNegIndex = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (firstNegIndex != 0 ? ((nums.length - 1) - (firstNegIndex - 1)) : 0);
    }

    public static void main(String[] args) {
        // int[] nums = { 4, 3, 2, 1 };
        int[] nums = { 1, 1, -1, -2 };
        System.out.println(count(nums));
    }
}
