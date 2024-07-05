package Pattern20;

public class Pattern20 {
    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < n; col++) {
                if (row == 1 || row == n || col == 1 || col == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(7);
    }
}
