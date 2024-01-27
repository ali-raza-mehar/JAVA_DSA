import java.util.Scanner;

public class Diognal_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        System.out.println(diognalSum(array));
    }

    static int diognalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0)
                        sum = sum + mat[i][j];
                } else {
                    if (j % 2 != 0)
                        sum = sum + mat[i][j];
                }
            }
        }
        return sum;
    }
}