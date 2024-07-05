package Pattern5;

public class Pattern5 {
    static void pattern(int n) {
        char alphabetic;
        for (int row = 1; row <= n; row++) {
            alphabetic = 'A';
            for (int col = 1; col <= row; col++) {
                System.out.print(alphabetic + " ");
                alphabetic++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern(5);
    }
}
