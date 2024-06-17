package Assignments.Meduim.Smallest_Divisor_Given_A_Threshold;

public class Smallest_Divisor {
    static int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = maximum(nums);
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossibleToGetSmallestNum(nums, mid, threshold)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (ans != -1 ? start : ans); // return the smallest divisor

    }

    // for finding maximum
    static int maximum(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    // for finding sum
    static boolean isPossibleToGetSmallestNum(int[] nums, int mid, int need) {
        int sum = 0;
        for (int num : nums) {
            sum += (int) Math.ceil((double) num / mid);
        }

        return (sum <= need);
    }

    public static void main(String[] args) {
        // int threshold = 6;
        // int[] nums = { 1, 2, 5, 9 };
        int threshold = 5;
        int[] nums = { 44, 22, 33, 11, 1 };
        System.out.println(smallestDivisor(nums, threshold));
    }
}
