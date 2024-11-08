package Notes.Notes_Code.Array_02;

public class Sorted {
    static boolean sort(int[] nums, int index) {
        if (index == nums.length - 1) {
            return true;
        }
        if (nums[index] < nums[index + 1]) {
            return sort(nums, index + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 10, 5, 6 };
        System.out.println(sort(nums, 0));
    }
}
