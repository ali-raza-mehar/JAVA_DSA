import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int reminder, num, sum;
        sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = in.nextInt();
        while (num > 0){
            reminder = num % 10;
            sum = sum + reminder;
            num = num / 10;
        }
        System.out.print("Sum of digits = " + sum);
    }
}
