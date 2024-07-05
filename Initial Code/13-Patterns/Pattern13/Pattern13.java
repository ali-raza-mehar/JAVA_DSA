package Pattern13;

public class Pattern13 {
    static void pattern(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColInRow = (row <= n) ? n - row + 1 : row - n;
            int totalSpaceInRow = (row <= n) ? row - 1 : n - totalColInRow;
            for (int space = 1; space <= totalSpaceInRow; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColInRow; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
