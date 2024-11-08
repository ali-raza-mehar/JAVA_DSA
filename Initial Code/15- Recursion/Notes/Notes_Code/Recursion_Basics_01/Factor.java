package Notes.Notes_Code.Recursion_Basics_01;

public class Factor {

    static int fact(int n) {
        if (n >= 1) {
            return n * fact(n - 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
