import java.util.Scanner;

public class PrimeInterval {
    public static void main(String[] args) {
        int num1, num2;
        int ep;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();
        ep = num2;
        for (int sp = (num1 + 1); sp < ep; sp++) {
            if (isPrime(sp))
                System.out.print(sp + "  ");
        }
    }

    static boolean isPrime(int num) {
        boolean prime = true;
        if (num >= 0 && num <= 1)
            return (prime = false);
        else if (num == 2)
            return (prime = true);
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0)
                    return false;
            }
            return prime;
        }
    }
}
