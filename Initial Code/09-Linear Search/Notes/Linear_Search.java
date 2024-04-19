
package Notes;

public class Linear_Search {
    static boolean linearSearch(int[] nums, int target) {
        if (nums.length == 0)
            return false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return true;
        }
        return false;
    }

    static int linearSearch(int[] nums, int target, int x) {
        if (nums.length == 0)
            return -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(linearSearch(nums, 4));
        System.out.println(linearSearch(nums, 4, 0));
    }
}