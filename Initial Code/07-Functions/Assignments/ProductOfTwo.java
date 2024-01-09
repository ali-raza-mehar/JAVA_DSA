import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        int num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();
        int pro = product(num1, num2);
        System.out.print("Product = " + pro);
        in.close();
    }

    static int product(int a, int b) {
        return (a * b);
    }
}
