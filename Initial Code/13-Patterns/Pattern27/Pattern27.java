package Pattern27;

public class Pattern27 {
    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= n; col++) {
                if (col == 1 || col == n || row == 1 || row == n) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }

            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
