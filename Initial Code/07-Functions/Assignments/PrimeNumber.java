import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = in.nextInt();
        if (isPrime(num))
            System.out.print(num + " is prime");
        else
            System.out.println(num + " is not prime");
        in.close();
    }

    static boolean isPrime(int num) {
        boolean prime = true;
        if (num >= 0 && num <= 1)
            return (prime = false);
        else if (num >= 2) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0)
                    return prime = false;
            }
        }
        return prime;
    }
}
