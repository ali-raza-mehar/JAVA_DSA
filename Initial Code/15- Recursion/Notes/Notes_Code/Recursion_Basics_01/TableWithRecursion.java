package Notes.Notes_Code.Recursion_Basics_01;

public class TableWithRecursion {
    public static void main(String[] args) {
        table(3, 1);
    }

    static void table(int n, int i) {
        // base condition
        // base condition is were recusrion will stop
        // if there is no base condition
        // then function call will keep happening

        if (i == 11) {
            return;
        }
        System.out.println(n + " * " + i + " = " + n * i);
        i++;

        // every time you will call the recursive function again and again it will take
        // separate memory every time
        // if every function call have separate memory
        table(n, i);
    }
}
