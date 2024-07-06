package Pattern29;

public class Pattern29 {
    static void pattern(int n) {
        int value = 1;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print("-");
            }

            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(value + " ");
                value++;
            }

            for (int space = 1; space <= 1; space++) {
                System.out.print("- ");
            }

            int value1 = (n * n) + 1;
            int value3 = 3;
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(value1);
                value1++;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}
