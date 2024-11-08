package Notes.Notes_Code.Recursion_Basics_01;

public class Tail_Recursion {
    // if last statment in function is recursive call
    // then it is called tail recursion
    // and there should be no statement after recursive call
    static int result = 0;

    static void sum(int n) {
        if (n > 0) {
            result = result + n;
            sum(n - 1);
        }
    }

    // conversion into loop
    static void conversion(int n) {
        while (n > 0) {
            result = result + n;
            n--;
        }
        System.out.println("Sum = " + result);
    }

    public static void main(String[] args) {
        conversion(5);
        // System.out.println("Sum = " + result);
    }
}
