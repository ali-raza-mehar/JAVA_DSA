public class firstMissingPositive {
    static int first_Missing_Positive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (element >= 1 && element <= n) {
                int chair = element - 1;
                if (element != nums[chair]) {
                    int temp = nums[chair];
                    nums[chair] = nums[i];
                    nums[i] = temp;
                    i--;
                }
            }
        }
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (count == nums[i])
                count++;
            else
                return count;
        }
        return n + 1;
    }

    public static void main(String[] args) {
        int[] numsp
    }
}
