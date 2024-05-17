package Assignments;

public class Two_D_Binary_Search {
    static boolean binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;

            if (matrix[row][mid] == target)
                return true;

            if (target > matrix[row][mid])
                colStart = mid + 1;
            else if (target < matrix[row][mid])
                colEnd = mid - 1;
        }
        return false;
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        int lastCol = col;

        // if row is 1 then simple apply binary search on it
        if (matrix.length < 2)
            return binarySearch(matrix, row, 0, lastCol, target);

        // run loop till rows are not 2
        // rows will be 2 only when the difference between (rowEnd - rowStart = 1)

        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        // find the middle column
        int midCol = col / 2;

        while (Math.abs(rowStart - rowEnd) != 1) {
            // apply binary search on middle column
            int mid = rowStart + (rowEnd - rowStart) / 2;

            // if rowStart and rowEnd will equal then do simple binary search
            if (rowEnd == rowStart) {
                return binarySearch(matrix, rowEnd, 0, lastCol, target);
            }

            // check whether the target lies in middle element row

            if (target > matrix[mid][midCol] && target <= matrix[mid][lastCol]) {
                return binarySearch(matrix, mid, midCol + 1, lastCol, target);
            }
            if (target < matrix[mid][midCol] && target >= matrix[mid][0]) {
                return binarySearch(matrix, mid, 0, midCol - 1, target);
            }

            // ***************************

            if (target > matrix[mid][midCol])
                // eliminate above rows inlcude middle element row
                rowStart = mid + 1;
            else if (target < matrix[mid][midCol])
                // eliminate below rows except middle element row
                rowEnd = mid;
            else
                return true;
        }

        // after this two rows will be remaining

        // check whether the midCol you are at contain your answer

        // check in 1st row
        if (matrix[rowStart][midCol] == target)
            return true;

        // check in 2nd row
        if (matrix[rowStart + 1][midCol] == target)
            return true;

        // if not contains
        // then make 4 half and search in it

        // search in 1st half
        if (target < matrix[rowStart][midCol])
            return binarySearch(matrix, rowStart, 0, midCol - 1, target);

        // search in 2nd half
        if (target > matrix[rowStart][midCol] && target <= matrix[rowStart][lastCol])
            return binarySearch(matrix, rowStart, midCol + 1, lastCol, target);

        // search in 3rd half
        if (target < matrix[rowStart + 1][midCol])
            return binarySearch(matrix, rowStart + 1, 0, midCol - 1, target);

        // search in 4th half
        if (target > matrix[rowStart + 1][midCol] && target <= matrix[rowStart + 1][lastCol])
            return binarySearch(matrix, rowStart + 1, midCol + 1, lastCol, target);

        return false;
    }

    public static void main(String[] args) {
        // int[][] matrix = {
        // { 1, 3, 5, 7 },
        // // { 10, 11, 16, 20 },
        // // { 23, 30, 34, 50 }
        // };

        // int[][] matrix = {
        // { 1 },
        // { 3 },
        // };

        int[][] matrix = {
                { -8, -8, -7, -7, -6, -5, -3, -2 },
                { 0, 0, 1, 3, 4, 6, 8, 8 },
                { 11, 12, 14, 16, 18, 18, 19, 19 },
                { 22, 23, 25, 27, 28, 30, 30, 31 },
                { 34, 35, 37, 39, 40, 42, 43, 45 },
                { 48, 50, 51, 51, 53, 54, 55, 57 },
                { 58, 60, 62, 62, 62, 63, 63, 65 },
                { 68, 69, 71, 72, 72, 72, 74, 76 },
        };

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

        System.out.println(searchMatrix(matrix, 63));
    }
}
