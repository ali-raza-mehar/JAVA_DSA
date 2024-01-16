import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        int num1, num2, reminder, count;
        count = 0;
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = num1;
        while (num2 > 0){
            reminder = num2 % 10;
            if(num1 % reminder == 0)
                  count++;
            num2 = num2 / 10;
        }
        System.out.print(count);
    }
}
