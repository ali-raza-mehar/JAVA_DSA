import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem {

    public static void main(String[] args) {
        // Example arrays
        int[] nums = { 1, 2, 3, 4, 0 };
        int[] index = { 0, 1, 2, 3, 0 };

        // Call the function and get the result
        int[] ans = createTargetList(nums, index);

        // Print the result
        System.out.println(Arrays.toString(ans));
    }

    static int[] createTargetList(int[] nums, int[] index) {
        int[] target = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            if (index[i] == nums[i])
                target[index[i]] = nums[i];
            else {
                for (int j = target.length - 1; j > index[i]; j--) {
                    target[j] = target[j - 1];
                }
                target[index[i]] = nums[i];
            }
        }
        return target;
    }
}
