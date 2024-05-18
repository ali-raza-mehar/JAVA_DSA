package Assignments.Easy.Maximum_Count_Of_Postive_And_Negative_Integers;

public class Maximum_Count {
    static int maximumCount(int[] nums) {
        // check if all elements are postivie or if all elements are negative then
        // simply return length
        // if length is 1 then also return length;
        if (nums[0] > 0 && nums[nums.length - 1] > 0 || nums[0] < 0 && nums[nums.length - 1] < 0
                || nums.length < 2 && nums[0] != 0)
            return nums.length;
        if (nums.length < 2 && nums[0] == 0)
            return 0;

        // first we will find the count of negative numbers
        int countNegative = negCountFind(nums);

        // find the count of postive elements
        int countPositive = posCountFind(nums);

        return (Math.max(countNegative, countPositive));

    }

    static int negCountFind(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int lastNegIndex = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < 0) {
                // update potential ans
                lastNegIndex = mid;
                // check in left, more negative elements exist or not
                start = mid + 1;
            } else {
                // if not negative it is mean element is positive since positive elements exist
                // in
                // right side
                // so eliminate right side
                end = mid - 1;
            }
        }

        return (lastNegIndex != 0 ? lastNegIndex + 1 : 0);
    }

    static int posCountFind(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int firstPostIndex = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > 0) {
                firstPostIndex = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (firstPostIndex != 0 ? ((nums.length - 1) - (firstPostIndex - 1)) : 0);

    }

    public static void main(String[] args) {
        // int[] nums = { -2, -1, -1, 1, 2, 3 };
        int[] nums = { -3, -2, 0, 0, 0, 1, 2 };
        // int[] nums = { 5, 20, 66, 1314 };
        // int[] nums = { -5, -20, -66, -70, 120 };
        System.out.println(maximumCount(nums));
    }
}
