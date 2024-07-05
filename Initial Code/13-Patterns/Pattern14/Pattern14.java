package Pattern14;

public class Pattern14 {
    static void pattern(int n) {
        int spaceInCenter = 1;
        for (int row = 1; row <= n; row++) {
            // before space
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (row > 1) {
                if (row == 5) {
                    for (int col = 1; col <= 7; col++) {
                        System.out.print("*");
                    }
                } else {
                    for (int space = 1; space <= spaceInCenter; space++) {
                        System.out.print(" ");
                    }
                    spaceInCenter += 2;
                }

                System.out.print("*");
            }

            // after space
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
