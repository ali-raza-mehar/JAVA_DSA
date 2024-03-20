import java.lang.reflect.Array;
import java.util.Arrays;

public class Spiral_Matrix_02 {

    static int[][] spiralMatrix(int n) {
        int[][] mat = new int[n][n];
        int totalLength = mat.length;
        int arrayAtColLength = mat[0].length;
        int top = 0, bottom = totalLength - 1;
        int left = 0, right = arrayAtColLength - 1;
        int count = 1;
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                mat[top][i] = count;
                count++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                mat[i][right] = count;
                count++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    mat[bottom][i] = count;
                    count++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    mat[i][left] = count;
                    count++;
                }
                left++;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] mat = spiralMatrix(1);
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}