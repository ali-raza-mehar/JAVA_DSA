import java.util.ArrayList;
import java.util.List;

public class With_List {
    static List<Integer> luckyNumber(int[][] matrix) {
        int[] nums = new int[matrix.length];
        List<Integer> list = new ArrayList<>();
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
        int max = nums[0];
        list.add(max); // Add an element to the list before using set
        // while it's not mandatory to initialize a list with elements, you should
        // ensure that the list has at least one element (using add) before trying to
        // access or modify elements using methods like set.
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                list.set(0, nums[i]);
                break;
            }
        }
        if (list.contains(0)) {
            return new ArrayList<>();
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] nums = {
                // { 1, 10, 4, 2 },
                // { 9, 3, 8, 7 },
                // { 1, 10, 4, 2 },
                { 7, 8 },
                { 1, 2 },
                // { 3, 7, 8 },
                // { 9, 11, 13 },
                // { 15, 16, 17, 12 },
        };
        System.out.println(luckyNumber(nums));
    }
}
