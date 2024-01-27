
public class Matrix_Obtain_By_Rotation {

    static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (check(mat, target)) {
                return true;
            }
            rotate(mat);
        }
        return false;
    }

    static boolean check(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }

    static void rotate(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        int ep;
        int temp;
        int index;
        for (int row = 0; row < mat.length; row++) {
            ep = (mat[row].length / 2);
            index = 0;
            for (int col = mat[row].length - 1; col >= ep; col--) {
                temp = mat[row][index];
                mat[row][index] = mat[row][col];
                mat[row][col] = temp;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                { 0, 0, 0 },
                { 0, 1, 0 },
                { 1, 1, 1 }
        };
        int[][] target = {
                { 1, 1, 1 },
                { 0, 1, 0 },
                { 0, 0, 0 }
        };
        System.out.println(findRotation(array, target));
    }
}