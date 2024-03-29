
public class JumpGame {
    static boolean jump_Game(int[] nums) {
        int lastIndex = nums.length - 1;
        if (nums.length == 1 && nums[nums.length - 1] != 0) {
            return true;
        }
        if (nums.length > 1) {
            if (nums[0] == 0)
                return false;
        }
        // if(nums[0] == 0)
        // return false;
        for (int i = 0; i <= lastIndex;) {
            int currentIndex = i;
            i += nums[i];
            if (i >= lastIndex) {
                return true;
            }
            for (int j = currentIndex + 1; j < i; j++) {
                if (j + nums[j] >= lastIndex)
                    return true;
                if (j + nums[j] == i + 1)
                    i = j + nums[j];
            }
            if (nums[i] == 0) {
                for (int j = currentIndex + 1; j < i;) {
                    j += nums[j];
                    if (j >= lastIndex)
                        return true;
                    if (nums[j] == 0)
                        return false;
                    if (j == i + 1 && nums[j] != 0)
                        i = j;
                }
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = { 5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0 };
        System.out.println(jump_Game(array));
    }
}
