import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter number of rows and column should be equal: ");
        // int rows = in.nextInt();
        // int column = in.nextInt();
        // int[][] array = new int[rows][column];
        int[][] array = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.println(diagonalSum(array));
        in.close();
    }

    static int diagonalSum(int[][] mat) {
        int sum1, sum2, sum, md, i;
        sum1 = 0;
        sum2 = 0;
        sum = 0;
        i = 1;
        if (mat[0].length % 2 == 0) {
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[row].length; col++) {
                    if (row == col) {
                        sum1 = sum1 + mat[row][col];
                        break;
                    }
                }
            }
            for (int row = 0; row < mat.length; row++) {
                for (int col = mat[row].length - i; col == mat[row].length - i; col++) {
                    sum2 = sum2 + mat[row][col];
                    i++;
                }
            }
            sum = sum1 + sum2;
        } else {
            md = mat[0].length / 2;
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[row].length; col++) {
                    if (row == col) {
                        sum1 = sum1 + mat[row][col];
                        break;
                    }
                }
            }
            for (int row = 0; row < mat.length; row++) {
                for (int col = mat[row].length - i; col == mat[row].length - i; col++) {
                    sum2 = sum2 + mat[row][col];
                    i++;
                }
            }
            sum = sum1 + sum2 - mat[md][md];
        }
        return sum;
    }
}