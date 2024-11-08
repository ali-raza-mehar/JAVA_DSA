package Notes.Notes_Code.Recursion_Basics_01;

public class FabonacciWithRecursion {

    static int fabo(int n) {
        if (n < 2) {
            return n;
        }

        return fabo(n - 1) + fabo(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fabo(3));
    }
}
