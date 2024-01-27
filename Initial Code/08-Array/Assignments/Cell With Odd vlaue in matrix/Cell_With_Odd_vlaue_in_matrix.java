import java.util.Scanner;

public class Cell_With_Odd_vlaue_in_matrix {
    public static void main(String[] args) {
        int[][] indices = {
                { 1, 1 },
                { 0, 0 }
        };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = in.nextInt();
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        System.out.println(cellWithOddValue(indices, m, n));

        // int[][] array = new int[m][n];
        // // for (int i = 0; i < m; i++) {
        // // for (int j = 0; j < n; j++) {
        // // array[i][j] = 0;
        // // }
        // // }
        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(array[i][j] + " ");
        // }
        // System.out.println();
        // }
        // System.out.println();
        // System.out.println();
        // int rowIndex = 0;
        // int colIndex = 0;
        // for (int i = 0; i < indices.length; i++) {
        // for (int j = 0; j < indices[i].length; j++) {
        // if (j == 0) {
        // rowIndex = indices[i][j];
        // for (int row = 0; row < array.length; row++) {
        // for (int col = 0; col < array[row].length; col++) {
        // if (rowIndex == row)
        // array[rowIndex][col]++;
        // else
        // break;
        // }
        // }
        // }
        // if (j == 1) {
        // colIndex = indices[i][j];
        // for (int row = 0; row < array.length; row++) {
        // for (int col = 0; col < array[row].length; col++) {
        // if (colIndex == col) {
        // array[row][colIndex]++;
        // }
        // }
        // }
        // }
        // }
        // }
        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(array[i][j] + " ");
        // }
        // System.out.println();
        // }

        // int count = 0;
        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // if (array[i][j] % 2 != 0)
        // count++;
        // }
        // }
        // System.out.println(count);
        in.close();
    }

    static int cellWithOddValue(int[][] indices, int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = 0;
            }
        }

        int rowIndex = 0;
        int colIndex = 0;
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices[i].length; j++) {
                if (j == 0) {
                    rowIndex = indices[i][j];
                    for (int row = 0; row < array.length; row++) {
                        for (int col = 0; col < array[row].length; col++) {
                            if (rowIndex == row)
                                array[rowIndex][col]++;
                            else
                                break;
                        }
                    }
                }
                if (j == 1) {
                    colIndex = indices[i][j];
                    for (int row = 0; row < array.length; row++) {
                        for (int col = 0; col < array[row].length; col++) {
                            if (colIndex == col) {
                                array[row][colIndex]++;
                            }
                        }
                    }
                }
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] % 2 != 0)
                    count++;
            }
        }
        return count;
    }
}