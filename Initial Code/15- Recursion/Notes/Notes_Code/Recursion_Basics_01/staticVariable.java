package Notes.Notes_Code.Recursion_Basics_01;

public class staticVariable {
    static int sum(int n) {
        if (n > 0) {
            return n + sum(n - 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Sum = " + sum(3));
    }
}
