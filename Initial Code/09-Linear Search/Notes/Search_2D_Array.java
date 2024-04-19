package Notes;

public class Search_2D_Array {
    static boolean linearSearch(int[][] array, int target) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    static int maxIn2d(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] > max) {
                    max = array[row][col];
                }
            }
        }
        return max;
    }

    static int minIn2d(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] < min) {
                    min = array[row][col];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4 },
                { 10, 20, 22, 23 },
                { 25, 30, 15, 13 },
        };
        System.out.println(linearSearch(mat, 30));
        System.out.print("Max = ");
        System.out.println(maxIn2d(mat));
        System.out.print("Min = ");
        System.out.println(minIn2d(mat));
    }
}
