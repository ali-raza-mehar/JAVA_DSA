import java.util.Arrays;

public class Set_matrix_zeros {

    static void setZeros(int[][] mat) {

        int rowLength = mat.length;
        int colLength = mat[0].length;
        int[] post = new int[rowLength * colLength * 2]; // Double the size to store row & col

        int count = 0;
        int rowPost = 0, colPost = 1;

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                if (mat[row][col] == 0) {
                    post[rowPost] = row;
                    post[colPost] = col;
                    count++;
                    rowPost += 2; // Increment by 1 for consecutive storage
                    colPost += 2; // Increment by 1 for consecutive storage
                }
            }
        }

        for (int i = 0; i < count; i++) {
            int partRow = post[i * 2]; // Access row index using i * 2
            int partCol = post[i * 2 + 1]; // Access col index using i * 2 + 1

            for (int row = 0; row < mat.length; row++) {
                mat[row][partCol] = 0;
            }
            for (int col = 0; col < mat[0].length; col++) {
                mat[partRow][col] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 1, 1 },
                { 1, 0, 0 },
                { 1, 1, 1 },
        };
        setZeros(mat);
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}
