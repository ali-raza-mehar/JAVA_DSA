package Questions.Easy.Special_Array_With_X_Elements;

import java.util.Arrays;

import javax.lang.model.util.Elements;

public class Special {
    static int specialArray(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] == 0 && nums[nums.length - 1] == 0)
            return -1;

        int i = 0;
        while (nums[i] == 0) {
            i++;
        }
        int element = (nums.length - 1 - (i - 1));

        // int count;
        for (i = element; i > 0; i--) {
            // count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= i) {
                    if (nums.length - 1 - (j - 1) == i) {
                        return i;
                    } else {
                        break;
                    }
                }
            }
            // if (count == i)
            // return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 9, 7, 8, 3, 8, 6, 6 };
        // int[] nums = { 3, 6, 7, 7, 0 };
        System.out.println(specialArray(nums));
    }
}
