package Pattern24;

public class Pattern24 {
    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            int valueForLeftTriangle = 1;
            int valueForRightTriangle = row;
            // left triangle
            for (int col = 1; col <= row; col++) {
                System.out.print(valueForLeftTriangle);
                valueForLeftTriangle++;
            }

            // space

            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            // space

            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // right triangle
            for (int col = 1; col <= row; col++) {
                System.out.print(valueForRightTriangle);
                valueForRightTriangle--;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}
