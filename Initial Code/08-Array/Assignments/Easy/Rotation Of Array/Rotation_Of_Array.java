
import java.util.Arrays;

public class Rotation_Of_Array {
    public static void main(String[] args) {
        int[] array = { -1, -100, 3, 99 };
        int k = 2;
        rotate(array, k);
    }

    // this for rotation of array.
    static void rotate(int[] nums, int k) {
        int temp = 0;
        for (int i = 1; i <= k; i++) {
            temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}