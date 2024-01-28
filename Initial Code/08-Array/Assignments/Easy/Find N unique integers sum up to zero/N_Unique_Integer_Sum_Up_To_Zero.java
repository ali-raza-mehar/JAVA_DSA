import java.util.Arrays;

public class N_Unique_Integer_Sum_Up_To_Zero {

    static int[] sumZero(int n) {
        int[] nums = new int[n];
        int count1 = -1;
        int count2 = 1;
        int mid = n / 2;
        if (n % 2 == 0) {
            for (int i = 0; i < mid; i++) {
                nums[i] = count1;
                count1--;
            }
            for (int i = mid; i < nums.length; i++) {
                nums[i] = count2;
                count2++;
            }
        } else {
            for (int i = 0; i < mid; i++) {
                nums[i] = count1;
                count1--;
            }
            nums[mid] = 0;
            for (int i = mid + 1; i < nums.length; i++) {
                nums[i] = count2;
                count2++;
            }
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);
        return nums;
    }

    public static void main(String[] args) {
        int[] array = sumZero(13);
        System.out.println(Arrays.toString(array));
    }
}