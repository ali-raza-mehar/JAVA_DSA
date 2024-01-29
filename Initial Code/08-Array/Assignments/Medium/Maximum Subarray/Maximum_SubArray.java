
// import java.util.Arrays;

public class Maximum_SubArray {

    static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        // int start = -1;
        // int ansStart = -1;
        // int ansEnd = -1;
        for (int i = 0; i < nums.length; i++) {

            /* this for find the subarray who has the maximum sum */
            /* we noticed that when sum is zero then we have new start */
            // if (sum == 0) {
            // start = i;
            // }

            // add the cuurent element according to corresponding index
            sum = sum + nums[i];
            if (sum > max) {
                max = sum;

                /*
                 * if the sum greater than max then
                 * ansStart = start;
                 * ansEnd = i;
                 * these are the starting and ending point of subarray that has the maximum sum
                 */
                // ansStart = start;
                // ansEnd = i;
            }

            /*
             * if sum is negative then it makes sense no need to carry if we will carry
             * negative sum and will add to next element it will always decrease the
             * upcoming sum so
             * ignore it and itialize sum zero
             */
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        System.out.println(maxSubArray(array));
    }
}