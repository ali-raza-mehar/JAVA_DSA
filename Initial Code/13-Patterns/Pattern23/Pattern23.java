package Pattern23;

public class Pattern23 {
    static void pattern(int n) {
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= n; col++) {
                // col % 4 == 0
                // ye is liye q k dusri row me jahan row + col % 4 == 0 nahi he na whaan pr
                // column 4 se divide ho rha hai stars k liye
                if ((row + col) % 4 == 0 || (row == 2) && (col % 4 == 0)) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(13);
    }
}
