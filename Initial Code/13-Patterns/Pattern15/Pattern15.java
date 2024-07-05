package Pattern15;

public class Pattern15 {
    static void pattern(int n) {
        int totalColInRow = 0;
        for (int row = 1; row <= n; row++) {
            // before space

            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }

            if (row == 1) {
                totalColInRow = (n + n) - row;
            } else {
                totalColInRow -= 2;
            }

            // print start and space in center
            for (int col = 1; col <= totalColInRow; col++) {
                // for row 1 and last row there in no space in center only stars
                if (row == 1 || row == n) {
                    System.out.print("*");
                    continue;
                }

                if (col == 1 || col == totalColInRow) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // after space
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }

            // totalColInRow -= 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
