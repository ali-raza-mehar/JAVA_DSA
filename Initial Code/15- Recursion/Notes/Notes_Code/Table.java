package Notes.Notes_Code;

public class Table {
    static void table(int n, int i) {
        if (i <= 10) {
            System.out.println(n + " * " + i + " = " + n * i);
        } else {
            System.out.println("***************");
            return;
        }

        table(n, i + 1);
        System.out.println(i);
    }

    public static void main(String[] args) {
        table(2, 1);
    }
}
