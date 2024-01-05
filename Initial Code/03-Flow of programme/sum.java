import  java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        int a , b;
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter first number:");
        a = input.nextInt();
        System.out.print("Enter second number:");
        b = input.nextInt();
        System.out.println("The sum is = " + (a + b));
    }
}
