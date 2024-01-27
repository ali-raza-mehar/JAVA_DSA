import java.util.Arrays;

public class Rotation_Of_Matrix {
    static int n;

    public static void main(String[] args) {
        int[][] mat = {
                { 0, 1 },
                { 1, 0 },
        };
        int[][] target = {
                { 1, 0 },
                { 0, 1 },
        };
        System.out.println(findRotation(mat, target));
    }

    static boolean findRotation(int[][] mat, int[][] target)

    {
        n = mat.length;
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }

            rotate(mat); // Rotate mat in-place
        }

        return false;
    }

    // Helper function to rotate the matrix clockwise
    static void rotate(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = mat[i][j];
                // Swap elements in a clockwise manner
                mat[i][j] = mat[n - j - 1][i];
                mat[n - j - 1][i] = mat[n - i - 1][n - j - 1];
                mat[n - i - 1][n - j - 1] = mat[j][n - i - 1];
                mat[j][n - i - 1] = temp;
            }
        }
    }
}
