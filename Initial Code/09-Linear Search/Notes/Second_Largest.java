package Notes;

public class Second_Largest {
    static int linearSearch(int[] nums) {
        int max1 = nums[0];
        // int index = 0;
        if (nums.length == 0)
            return -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max1) {
                max1 = nums[i];
            }
        }
        int max2;
        if (max1 != nums[0]) {
            max2 = nums[0];
        } else
            max2 = nums[1];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != max1) {
                if (nums[i] > max2) {
                    max2 = nums[i];
                }
            }
        }
        return max2;
        // return min;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 8 };
        System.out.println(linearSearch(nums));
    }
}
