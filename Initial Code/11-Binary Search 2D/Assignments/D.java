package Assignments;

public class D {

    static boolean binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;

            if (target > matrix[row][mid]) {
                colStart = mid + 1;
            } else if (target < matrix[row][mid]) {
                colEnd = mid - 1;
            } else
                return true;
        }

        return false;
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        int lastCol = col;

        if (matrix.length < 2) {
            return binarySearch(matrix, row, 0, col, target);
        }

        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int midCol = col / 2;

        while (rowStart < rowEnd) {
            int mid = rowStart + (rowEnd - rowStart) / 2;

            // check if target equals to middle

            if (target == matrix[mid][midCol]) {
                return true;
            }

            // check if target exit in mid row
            if (target > matrix[mid][midCol] && target <= matrix[mid][lastCol]) {
                return binarySearch(matrix, mid, midCol + 1, lastCol, target);
            } else if (target < matrix[mid][midCol] && target >= matrix[mid][0]) {
                return binarySearch(matrix, mid, 0, midCol - 1, target);
            }

            // check not exit in middle row then update rowStart and rowEnd
            if (target > matrix[mid][midCol] && target > matrix[mid][lastCol]) {
                rowStart = mid + 1;
            } else if (target < matrix[mid][midCol] && target < matrix[mid][0]) {
                rowEnd = mid - 1;
            }
        }

        // check in last row

        return binarySearch(matrix, rowEnd, 0, lastCol, target);

    }

    public static void main(String[] args) {
        // int[][] matrix = {
        // { 1, 3, 5, 7 },
        // // { 10, 11, 16, 20 },
        // // { 23, 30, 34, 50 }
        // };

        int[][] matrix = {
                { 1 },
                { 3 },
        };

        // int[][] matrix = {
        // { -8, -8, -7, -7, -6, -5, -3, -2 },
        // { 0, 0, 1, 3, 4, 6, 8, 8 },
        // { 11, 12, 14, 16, 18, 18, 19, 19 },
        // { 22, 23, 25, 27, 28, 30, 30, 31 },
        // { 34, 35, 37, 39, 40, 42, 43, 45 },
        // { 48, 50, 51, 51, 53, 54, 55, 57 },
        // { 58, 60, 62, 62, 62, 63, 63, 65 },
        // { 68, 69, 71, 72, 72, 72, 74, 76 },
        // };

        // int[][] matrix = {
        // { -10, -8 },
        // { -6, -5 },
        // { -2, -2 },
        // { -1, 0 },
        // { 3, 4 },
        // { 7, 7 },
        // { 8, 9 },
        // { 10, 10 },
        // { 11, 11 },
        // { 12, 14 },
        // { 15, 16 },
        // { 17, 19 },
        // { 20, 21 },
        // { 22, 22 },
        // { 25, 27 },
        // { 28, 30 },
        // { 32, 32 },
        // { 35, 36 }
        // };

        System.out.println(searchMatrix(matrix, 0));
    }
}
