package Pattern9;

public class Pattern9 {
    static void pattern(int n) {
        int totalRowInCol = 1;
        int totalColInRow = 8;
        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <= totalColInRow; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalRowInCol; col++) {
                System.out.print("*");
            }
            System.out.println();
            totalRowInCol += 2;
            totalColInRow -= 2;
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
