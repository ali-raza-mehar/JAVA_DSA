import java.util.Scanner;

public class FibonnaciNumber {
    public static void main(String[] args) {
        int lastTwoTerm , a = 0 , b = 1 , lastDigit;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to find up to fibonacci series: ");
        n = in.nextInt();
        int count = 2;
        System.out.print("0 , 1 , ");
        while (count <= n){
            lastTwoTerm= a + b;
            lastDigit  = lastTwoTerm;
            a = b;
            b = lastDigit;
            System.out.print(b);
            if(count < n)
                System.out.print(" , ");
            count++;
        }
    }
}
