package Pattern6;

public class Pattern6 {
    static void pattern(int n) {
        int i = 1;
        for (int row = 1; row <= 9; row++) {
            if (row > n) {
                for (int col = 1; col <= n - i; col++) {
                    System.out.print("*");
                }
                System.out.println();
                i++;
            } else {
                for (int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
