package Pattern22;

public class Pattern22 {
    static void pattern(int n) {
        int value;
        for (int row = 1; row <= n; row++) {
            if (row % 2 == 0) {
                value = 0;
            } else
                value = 1;

            for (int col = 1; col <= row; col++) {
                System.out.print(value + " ");
                if (value == 0) {
                    value = 1;
                } else
                    value = 0;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(7);
    }
}
