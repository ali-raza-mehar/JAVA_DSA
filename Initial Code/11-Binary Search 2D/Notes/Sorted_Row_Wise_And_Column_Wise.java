
package Notes;

import java.util.Arrays;

public class Sorted_Row_Wise_And_Column_Wise {

    /*
     * matrix = {
     * {10, 20, 30, 40}
     * {15, 22, 32, 42}
     * {17, 24, 34, 44}
     * {19, 26, 36, 46}
     * }
     */

    static int[] search(int[][] matrix, int target) {
        int lb = 0;
        int up = matrix[0].length - 1;

        while (lb < matrix.length && up >= 0) {

            if (matrix[lb][up] == target) {
                return new int[] { lb, up };
            }

            if (matrix[lb][up] > target) {
                up--;
            } else if (matrix[lb][up] < target) {
                lb++;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 15, 22, 32, 42 },
                { 17, 24, 34, 44 },
                { 10, 20, 30, 40 },
                { 19, 26, 36, 46 },
        };
        System.out.println(Arrays.toString(search(matrix, 26)));
    }

}