
package Sliding_Window.Notes.Constant_Sliding_Window;

public class Constant {
    /*
     * - How to approach:
     * 
     * The general steps to solve these questions by following below steps:
     * 
     * - Find the size of the window required, say K.
     * - Compute the result for 1st window, i.e. include the first K elements of the
     * data structure.
     * - Then use a loop to slide the window by 1 and keep computing the result
     * window by window.
     */

    static int maxSubArraySum(int[] nums, int k) {
        if (nums.length < k) {
            // try {

            // } catch (Exception e) {
            // // TODO: handle exception
            // }
            throw new IllegalArgumentException("Array length must be at least k");
        }
        int windowSum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;

        int left = 0;
        int right = k - 1;
        while (right < nums.length - 1) {
            // before sliding remove element from sum
            windowSum -= nums[left];
            // after removing slide by 1
            left++;
            right++;
            windowSum += nums[right];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 2, 3, 3, 4, 5, -1 };
        System.out.println(maxSubArraySum(nums, 8));
    }
}