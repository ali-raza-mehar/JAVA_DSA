package Notes;

public class Minimum_Number {
    static int linearSearch(int[] nums) {
        int min = nums[0];
        if (nums.length == 0)
            return -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 3, 4, 5, 7, 8 };
        System.out.println(linearSearch(nums));
    }
}
