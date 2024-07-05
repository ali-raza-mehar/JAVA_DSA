package Pattern17;

public class Pattern17 {

    static void pattern(int n) {
        for (int row = 1; row <= (n + n - 1); row++) {
            int spaces = (row <= n) ? n - row : row - n;
            int leftTriangle = n - spaces;
            int rightTriangle = (row <= n) ? row - 1 : leftTriangle - 1;
            int leftValue = (row <= n) ? row : n - spaces;
            int rigthValue = 2;

            // left Spaces
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            // left triangle

            for (int left = 1; left <= leftTriangle; left++) {
                System.out.print(leftValue);
                leftValue--;
            }

            // rigth triangle

            for (int right = 1; right <= rightTriangle; right++) {
                System.out.print(rigthValue);
                rigthValue++;
            }

            // right spaces

            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        pattern(9);
    }
}
