
public class VarAr {
    public static void main(String[] args) {
        sum(2, 3, 4, 6, 7, 8, 9, 9, 10, 11);
    }

    static void sum(int... v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    static void varA(int a, int b, int... v) {
        System.out.println(a + b);
    }
    // varA should be always at last
}
