import java.util.Arrays;

// converting rows into column
public class Transpose {
    public static void main(String[] args) {
        int[][] array = {
                { 2, 4, -1 },
                { -10, 5, 11 },
                { 18, -7, 6 },
        };
        int[][] ans = transpose(array);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] transpoed = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpoed[j][i] = matrix[i][j];
            }
        }
        return transpoed;
    }
}