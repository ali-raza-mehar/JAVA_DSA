package Pattern21;

public class Pattern21 {
    static void pattern(int n) {
        int value = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(6);
    }
}
