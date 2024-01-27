import java.util.Arrays;

public class Reverse_Array {

    static void rotate(int[] nums) {
        int ep = nums.length - 1;
        for (int sp = 0; sp < ep; sp++) {
            int temp = nums[sp];
            nums[sp] = nums[ep];
            nums[ep] = temp;
            ep--;
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(array);
        System.out.println(Arrays.toString(array));
    }
}