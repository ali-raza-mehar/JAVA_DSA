import java.util.Arrays;

public class Two_D_Reverse_Array {

    static void reverse(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            int ep = nums[i].length - 1;
            for (int sp = 0; sp < ep; sp++) {
                int temp = nums[i][sp];
                nums[i][sp] = nums[i][ep];
                nums[i][ep] = temp;
                ep--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                { 1, 2 },
                { 1, 2 },
                { 1, 2 },
        };
        reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}