import java.util.Scanner;

public class NumberTarget2 {
    public static void main(String[] args) {
        int num , target , count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = in.nextInt();
        System.out.print("Enter the digit that you want to find how many times it repeats: ");
        target = in.nextInt();
        while (num > 0){
            int lastDigit = num % 10;
            if(lastDigit == target)
            {
                count++;
            }
            num /= 10;
        }
        System.out.println("Digit = " + target);
        System.out.println("Repeats = " + count + " times");
    }
}
