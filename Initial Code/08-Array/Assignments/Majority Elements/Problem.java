public class Problem {

    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        // Boyer-Moore Voting Algorithm
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = { 3, 2, 3 };
        System.out.println("Example 1: " + majorityElement(nums1));

        // Example 2
        int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("Example 2: " + majorityElement(nums2));
    }
}
