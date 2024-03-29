import java.util.Arrays;

public class First_and_last_position {

    static int[] searchRange(int[] nums, int target) {
        int count = 0;
        int[] range = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (count == 0 && nums[i] == target) {
                range[0] = i;
                count++;
            } else if (nums[i] == target) {
                range[1] = i;
            }
        }
        // if there is target is only one
        if (count == 1 && range[1] == 0) {
            range[1] = range[0];
            return range;
        } else if (count == 0) {
            return new int[] { -1, -1 };
        } else {
            return range;
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 5 };
        int[] range = searchRange(array, 4);
        System.out.println(Arrays.toString(range));
    }

}
