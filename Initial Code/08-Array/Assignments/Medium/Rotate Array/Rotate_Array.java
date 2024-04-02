import java.util.Arrays;

public class Rotate_Array {

    static void rotate(int[] nums, int k) {
        int n = nums.length;
        // k can be greater than the length
        k = k % n;
        /* firstly reverse the entire array */
        int left = 0, right = n - 1;
        // int mid = n / 2;
        for (; left < right; left++) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            right--;
        }
        // reverse the k elements
        left = 0;
        right = k - 1;
        // mid = k / 2;
        for (; left < right; left++) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            right--;
        }

        // now reverse the others elements
        left = k;
        right = n - 1;
        for (; left < right; left++) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            right--;
        }

    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        // int[] array = { 1, 2 };
        // int[] array = { -1, -100, 3, 99 };
        rotate(array, 3);
        System.out.println(Arrays.toString(array));
    }

}
