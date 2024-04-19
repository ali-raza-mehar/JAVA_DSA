package Notes;

public class Search_In_Range {
    static boolean linearSearch(int[] nums, int target, int sp, int ep) {
        if (nums.length == 0) {
            return false;
        }
        for (int i = sp; i <= ep; i++) {
            if (target == nums[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(linearSearch(nums, 5, 2, 6));
    }

}
