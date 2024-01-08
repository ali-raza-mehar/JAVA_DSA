public class Overloading {
    public static void main(String[] args) {

    }

    static void sum(int a, int b) {
        System.out.println(a + b);
    }

    static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static void varA(int... v) {
        System.out.println(v[0]);
    }

    static void varA(String... v) {
        System.out.println(v[0]);
    }
}
