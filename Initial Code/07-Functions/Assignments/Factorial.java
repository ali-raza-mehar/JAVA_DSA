import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = in.nextInt();
        long ans = factorial(num);
        System.out.print(" = " + ans);
        in.close();
    }

    static long factorial(int num) {
        long fact = 1;
        if (num == 0) {
            System.out.print(num + "!");
            return 1;
        } else if (num >= 1 && num < 2) {
            System.out.print(num + "! = 1 * 1");
            return 1;
        } else {
            System.out.print(num + "! = ");
            for (int i = num; i >= 1; i--) {
                System.out.print(i);
                if (i > 1)
                    System.out.print(" * ");
                fact = fact * i;
            }
            return fact;
        }
    }
}
