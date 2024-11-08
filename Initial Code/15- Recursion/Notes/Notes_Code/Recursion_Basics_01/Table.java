package Notes.Notes_Code.Recursion_Basics_01;

public class Table {
    static void table(int n, int i) {
        if (i <= 10) {
            System.out.println(n + " * " + i + " = " + n * i);
            table(n, ++i);
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        table(2, 1);
    }
}
