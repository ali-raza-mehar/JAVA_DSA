
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int j = 0; // Pointer for the last unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1; // Return the count of unique elements
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = { 1, 1, 2 };
        int expectedNums1Length = 2;
        int[] expectedNums1 = { 1, 2 };

        int k1 = removeDuplicates(nums1);
        assert k1 == expectedNums1Length;
        for (int i = 0; i < k1; i++) {
            assert nums1[i] == expectedNums1[i];
        }

        // Example 2
        int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int expectedNums2Length = 5;
        int[] expectedNums2 = { 0, 1, 2, 3, 4 };

        int k2 = removeDuplicates(nums2);
        assert k2 == expectedNums2Length;
        for (int i = 0; i < k2; i++) {
            assert nums2[i] == expectedNums2[i];
        }
    }
}
