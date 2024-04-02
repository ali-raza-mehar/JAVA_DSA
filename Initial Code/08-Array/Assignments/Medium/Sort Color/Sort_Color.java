
// import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort_Color {
    static void sortColors(int[] nums) {
        // int n = nums.length;
        // firstly move zeros to first index
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        // move ones after zeros
        /*
         * i will start from j not from zero index because they are already sorted we
         * will start from where sorted zeros are ended
         */
        for (int i = j; i < nums.length; i++) {
            if (nums[i] == 1) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        // int[] array = { 2, 0, 2, 1, 1, 0 };
        // int[] array = { 2, 0, 2, 2, 1 };
        int[] array = { 2, 0, 1 };
        sortColors(array);
        System.out.println(Arrays.toString(array));
    }
}
