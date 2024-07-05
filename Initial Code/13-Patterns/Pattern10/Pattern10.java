package Pattern10;

public class Pattern10 {
    static void pattern(int n) {
        int totalColInRow = 9;
        for (int row = 1; row <= n; row++) {

            // before space
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColInRow; col++) {
                System.out.print("*");
            }
            // after space
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            System.out.println();
            totalColInRow -= 2;
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
