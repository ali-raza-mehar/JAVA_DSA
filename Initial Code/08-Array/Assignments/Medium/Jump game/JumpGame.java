
public class JumpGame {
    static boolean jump_Game(int[] nums) {

        int goal = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        if (goal == 0) {
            return true;
        } else
            return false;

    }

    public static void main(String[] args) {
        int[] array = { 5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0 };
        System.out.println(jump_Game(array));
    }
}
