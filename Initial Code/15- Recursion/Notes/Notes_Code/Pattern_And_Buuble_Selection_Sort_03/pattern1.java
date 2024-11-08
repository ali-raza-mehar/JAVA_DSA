
// *****
// ****
// ***
// **
// *

package Notes.Notes_Code.Pattern_And_Buuble_Selection_Sort_03;

public class pattern1 {

    static void pattern(int row, int col, int n) {
        if (row > n) {
            return;
        }
        if (col <= n - row + 1) {
            System.out.print("*");
            pattern(row, col + 1, n);
        } else {
            System.out.println();
            pattern(row + 1, col = 1, n);
        }
    }

    public static void main(String[] args) {
        pattern(1, 1, 5);
    }

}