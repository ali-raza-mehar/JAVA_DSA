import java.util.Arrays;

public class Reshape_Mat {

    static int[][] reshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int row = 0;
        int col = 0;
        int[][] res = new int[r][c];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[row][col] = mat[i][j];
                col++;

                if (col == c) {
                    row++;
                    col = 0;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, },
                { 3, 4, },
                { 5, 6, },
        };
        int[][] res = reshape(mat, 2, 3);
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }

}