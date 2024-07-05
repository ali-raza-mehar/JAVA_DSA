package Pattern25;

public class Pattern25 {
    static void pattern(int n) {
        char value = (char) ('A' + (n - 1));
        // System.out.print(value);
        for (int row = 1; row <= n; row++) {
            char value1 = value;
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(value1 + " ");
                value1 = (char) (value1 - 1);
            }
            value = (char) (value - 1);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
