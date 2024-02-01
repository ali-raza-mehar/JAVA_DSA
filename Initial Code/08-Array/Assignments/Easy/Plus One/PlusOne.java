
// import java.lang.reflect.Array;
import java.util.Arrays;

public class PlusOne {

    static int[] plusOne(int[] digits) {
        double ans = 0;
        for (int i = 0; i < digits.length; i++) {
            ans = ans * 10 + digits[i];
        }
        ans++;
        String num = "" + ans;
        System.out.println(num);
        int n = num.length();
        int[] nums = new int[n];
        int i = num.length() - 1;
        while (ans > 0) {
            long reminder = (int) ans % 10;
            nums[i] = (int) reminder;
            ans = ans / 10;
            i--;
        }
        // System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1,
                1, 1, 7, 4, 0, 0, 6 };
        System.out.println(Arrays.toString(plusOne(nums)));
        // plusOne(nums);
    }
}