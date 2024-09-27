package Notes.Notes_Code;

public class staticVariable {
    static int sum(int n) {
        if (n >= 0) {
            return sum(n - 1) + n;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Sum = " + sum(5));
    }
}
