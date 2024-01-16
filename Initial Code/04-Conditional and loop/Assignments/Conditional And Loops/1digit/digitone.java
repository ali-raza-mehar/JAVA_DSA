import java.util.Scanner;

public class digitone {
    public static void main(String[] args) {
        // Your main method code here
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any digit: ");
        num = in.nextInt();
       int result =  addDigits(num);
        System.out.print(result);
    }

   static int addDigits(int num) {
        int sum, reminder;
        boolean check = true;
        while (check) {
            if (num >= 0 && num <= 9)
                return num;
            sum = 0;
            while (num > 0) {
                reminder = num % 10;
                sum = sum + reminder;
                num = num / 10;
            }
            if (sum == 1) {
                return sum;
            } else {
                num = sum;
            }
        }
        return -1; // Add a default return statement in case the loop doesn't exit as expected
    }
}
