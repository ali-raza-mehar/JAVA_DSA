import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] array = { 1, 7, 2, 2 };
        int target = 9;
        int[] indices = twoSum(array, target);

        if (indices != null) {
            System.out.println(Arrays.toString(indices));
        } else {
            System.out.println("No two sum solution");
        }
    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null; // Return null if no match is found
    }
}
