package Pattern19;

public class Pattern19 {
    static void pattern(int n) {
        for (int row = 1; row <= (n + n - 1); row++) {
            // left triangle
            int spaces = (row <= n) ? n - row : row - n;
            int totalCols = (row <= n) ? row : n - spaces;

            // left triangle
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("*");
            }

            // left triangle space
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            // right triangle space

            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            // right triangle

            for (int col = 1; col <= totalCols; col++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        pattern(6);
    }
}
