
public class Lucky_Number {

    static int[] luckyNumber(int[][] matrix) {
        int[] nums = new int[matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            int currentIndex = 0;
            int min = matrix[row][0];
            for (int col = 0; col < matrix[row].length; col++) {
                if (min > matrix[row][col]) {
                    min = matrix[row][col];
                    currentIndex = col;
                }
            }
            boolean isLucky = true;
            for (int i = 0; i < nums.length; i++) {
                if (min != matrix[i][currentIndex]) {
                    if (min < matrix[i][currentIndex]) {
                        isLucky = false;
                        break;
                    }
                }
            }
            if (isLucky)
                nums[row] = min;
            else
                nums[row] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[][] nums = {
                { 1, 10, 4, 2 },
                { 9, 3, 8, 7 },
                { 1, 10, 4, 2 },
                // { 7, 8 },
                // { 1, 2 },
                // { 3, 7, 8 },
                // { 9, 11, 13 },
                { 15, 16, 17, 12 },
        };
        int[] array = luckyNumber(nums);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}