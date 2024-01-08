import java.util.Scanner;

// all the data types are pass by value except array.

public class Sum {
    public static void main(String[] args) {
        int num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();
        sum(num1, num2);
        in.close();
    }

    static void sum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
}
