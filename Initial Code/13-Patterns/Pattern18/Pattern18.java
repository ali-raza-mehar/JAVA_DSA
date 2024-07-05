package Pattern18;

public class Pattern18 {
    static void pattern(int n) {
        for (int row = 1; row <= (n + n); row++) {
            int totalCols = (row <= n) ? (n - row + 1) : row - n;
            int spaces = (row <= n) ? row - 1 : n - totalCols;

            // left triangle
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("*");
            }

            // left triangle spaces

            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            // right triangle spaces

            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            // right trianlge
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // pattern(5);
        pattern(6);
    }
}
