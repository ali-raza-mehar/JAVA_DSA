import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = in.nextInt();
        int ans = isPalindrome(num);
        if (ans == 1)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        in.close();
    }

    static int isPalindrome(int num1) {
        int num2;
        int reminder, sum;
        sum = 0;
        num2 = num1;
        // 1.) calculate the sum of digits
        while (num2 > 0) {
            reminder = num2 % 10;
            sum = sum + reminder;
            num2 = num2 / 10;
        }

        // now we will check sum of digit is palindrome or not
        int ans = 0;
        int reminder2;
        int sum2 = sum;
        while (sum2 > 0) {
            reminder2 = sum2 % 10;
            ans = ans * 10 + reminder2; // for reverse
            sum2 = sum2 / 10;
        }
        if (ans == sum)
            return 1;
        else
            return 0;
    }
}
