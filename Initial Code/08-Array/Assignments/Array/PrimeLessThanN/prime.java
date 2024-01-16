import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int num;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = in.nextInt();
        if (num >= 0 && num <= 3)
            System.out.println("The prime numbers exist before " + num + " are " + count);
        else if (num >= 4) {
            for (int i = 1; i < num; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
        }
        System.out.println("The prime numbers exist before " + num + " are " + count);
        in.close();
    }

    static boolean isPrime(int num) {
        boolean prime = true;
        if (num >= 0 && num <= 1)
            return (prime = false);
        else if (num == 2)
            return prime = true;
        else if (num >= 3) {
            for (long i = 2; i < num; i++) {
                if (i * i == num)
                    return false;
                if (num % i == 0)
                    return (prime = false);
            }
        }
        return prime;
    }
}