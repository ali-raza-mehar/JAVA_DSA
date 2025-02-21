package Notes.Notes_Code.Pattern_And_Buuble_Selection_Sort_03;

public class starPattern {

    static void pattern(int n) {
        helper(1, 1, n);
    }

    static void helper(int row, int col, int n) {
        if (row > n) {
            return;
        }

        if (col <= n - row + 1) {
            helper(row, col + 1, n);
            System.out.print("*");
        } else {
            helper(row + 1, col = 1, n);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }

}
