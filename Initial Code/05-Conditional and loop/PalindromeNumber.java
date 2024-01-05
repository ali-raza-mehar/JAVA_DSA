import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num1, num2, ans, reminder;
        ans = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        num1 = in.nextInt();
        num2 = num1;
        while (num2 > 0){
            reminder = num2 % 10; // to get reminder
            ans = ans * 10 + reminder; // to get reverse
            num2 = num2 / 10; // remove lat digit
        }
        if(num1 == ans)
            System.out.print(num1 + " is palindrome");
        else
            System.out.print(num1 + " is not palindrome");
    }
}
