package Notes.Notes_Code;

public class NumberExampleRecursion {
    // public static void main(String[] args) {
    // print(1, 1);
    // }

    // static void print(int n, int i) {
    // if (n <= 5) {
    // System.out.println(n);
    // } else {
    // System.out.println("Part after calling");
    // return;
    // }

    // print(n + 1, i + 1);
    // System.out.println(i + "");
    // }

    static void func(int n) {
        if (n > 0) {
            func(n - 1);
            System.out.println(n);
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        func(3);
    }
}
