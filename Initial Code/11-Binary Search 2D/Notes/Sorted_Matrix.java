package Notes;

import java.util.Arrays;

public class Sorted_Matrix {
    /*
     * matrix = {
     * {10, 20, 30, 40}
     * {50, 60, 70, 80}
     * {90, 100, 110, 120}
     * {130, 140, 150, 160}
     * }
     */

    // search for two arrays
    // it will take
    // in which row you want to search
    // from where column you want to search
    // what you want to search
    static int[] binarySearch(int[][] array, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;

            if (target > array[row][mid]) {
                // eliminate first half
                colStart = mid + 1;
            } else if (target < array[row][mid]) {
                // eliminate second half
                colEnd = mid - 1;
            } else
                return new int[] { row, mid };
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        // if row is 1 then simple do binary seach
        if (row == 0) {
            return binarySearch(matrix, row, 0, col, target);
        }

        // run loop till 2 rows are remaining
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colMid = col / 2;

        while (Math.abs(rowEnd - rowStart) != 1) {
            int mid = rowStart + (rowEnd - rowStart) / 2;

            if (matrix[mid][colMid] == target) {
                return new int[] { mid, colMid };
            }

            if (target < matrix[mid][colMid]) {
                // eleminate rows after mid
                rowEnd = mid;
            } else if (target > matrix[mid][colMid]) {
                // eleminate above rows
                rowStart = mid + 1;
            }

        }

        // now search in last 2 rows

        // first check
        // whether the mid column you are at contains the ans

        if (matrix[rowStart][colMid] == target) {
            return new int[] { rowStart, colMid };
        }
        // check the middle of 2nd row
        if (matrix[rowStart + 1][colMid] == target) {
            return new int[] { rowStart + 1, colMid };
        }

        // search in 1st half
        if (target < matrix[rowStart][colMid]) {
            return binarySearch(matrix, rowStart, 0, colMid - 1, target);
        }

        // search in 2nd half
        if (target > matrix[rowStart][colMid] && target <= matrix[rowStart][col]) {
            return binarySearch(matrix, rowStart, colMid + 1, col, target);
        }

        // search in 3rd half
        if (target < matrix[rowStart + 1][colMid]) {
            return binarySearch(matrix, rowStart + 1, 0, colMid - 1, target);
        }

        // search in 4th half
        if (target > matrix[rowStart + 1][colMid] && target <= matrix[rowStart + 1][col]) {
            return binarySearch(matrix, rowStart + 1, colMid + 1, col, target);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 50, 60, 70, 80 },
                { 90, 100, 110, 120 },
                { 130, 140, 150, 160 },
        };

        System.out.println(Arrays.toString(search(matrix, 5)));
    }

}
