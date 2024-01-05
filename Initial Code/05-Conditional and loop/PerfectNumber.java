import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        /*
        Perfect Number:A "perfect number" has a very specific meaning! It's a positive integer that is equal to the sumOFDivisor of its own positive divisors, excluding itself.
        i.e:
        a)Take the number 6. Its divisors are 1, 2, and 3. If we add these up (1 + 2 + 3), we get 6! Therefore, 6 is a perfect number.
        b)28: Its divisors are 1, 2, 4, 7, and 14, and 1 + 2 + 4 + 7 + 14 = 28.
         */
        int num, divisor, sumOFDivisor;
        divisor = 1;
        sumOFDivisor = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter only positive number to check perfect or not: ");
        num = in.nextInt();
             while (divisor < num){
                if(divisor == 1)
                   sumOFDivisor = 1;
                 else if(num % divisor == 0)
                 {
                     sumOFDivisor = sumOFDivisor + divisor;
                 }
                 divisor++;

             }
        if(num >= 0 && num <= 1)
            System.out.print(num + " not perfect number");
        else if (num < 0) {
            System.out.print(num + " not perfect number");
        } else if(num == sumOFDivisor)
            System.out.print(num + " perfect number");
        else
            System.out.print(num + " not perfect number");
    }
}
