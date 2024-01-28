
// import java.util.Arrays;

public class Maximum_SubArray {

    static int maxSubArray(int[] nums) {
        int n = nums.length;
        int lenghtOfMatrix = n * (n + 1) / 2;
        int row = 0;
        int[][] matrix = new int[lenghtOfMatrix][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int index = i;
                while (index <= j) {
                    matrix[row][index] = nums[index];
                    index++;
                }
                row++;
            }
        }

        // for (int i = 0; i < matrix.length; i++) {
        // System.out.println(Arrays.toString(matrix[i]));
        // }
        int sum = 0;
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
            // System.out.println("Sum: " + sum);
            if (sum > max) {
                max = sum;
            }
            // System.out.println("Max: " + max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = { -3, -2, -2, -3 };
        System.out.println(maxSubArray(array));
    }
}