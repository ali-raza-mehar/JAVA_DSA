package Assignments.Meduim.Capacity_To_Ship_Package_With_In_D_Days;

public class Capacity {

    // to find max
    static int findMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max)
                max = num;
        }
        return max;
    }

    // to find sum

    static int findSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        return sum;
    }

    // to find number of days
    static int totalDays(int[] nums, int capacity) {
        int sum = 0;
        int days = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > capacity) {
                days++;
                sum = nums[i];
            }
        }
        // if (sum < capacity) {
        // days++;
        // }

        return ++days;
    }

    static int shipWithinDays(int[] weights, int days) {

        // first compute the max and find days beacuse most of the times max is ans
        int max = findMax(weights);
        int ans = totalDays(weights, max);
        if (ans == days) {
            return ans;
        }

        // our ans will always lie between max element
        // and total sum of all weights

        int start = findMax(weights);
        int end = findSum(weights);
        ans = 0;

        while (start < end) {
            int mid = start + (end - start) / 2;
            ans = totalDays(weights, mid);
            if (ans <= days) {
                ans = mid;
                end = mid - 1;
            } else if (ans > days) {
                start = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 1, 1 };
        int[] nums = { 10, 50, 100, 100 };
        // int[] nums = { 3, 2, 2, 4, 1, 4 };
        // int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(shipWithinDays(nums, 4));
    }

}
