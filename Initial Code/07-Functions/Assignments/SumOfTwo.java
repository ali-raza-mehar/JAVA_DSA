import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        int num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();
        int sum = Sum(num1, num2);
        System.out.println("Sum = " + sum);
        in.close();
    }

    static int Sum(int a, int b) {
        return (a + b);
    }
}
