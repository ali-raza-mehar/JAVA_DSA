import java.util.Scanner;

public class TwoPower {
    public static void main(String[] args) {
        int num1, count = 0, num2;
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = num1;
        if(num1 % 2 == 0){
             while (num2 > 1){
              num2 = num2 / 2;
              count++;
             }
             if(Math.pow(2, count) == num1)
                System.out.print("power of two");
             else
                System.out.print("Not power of two");
        }
        else
            System.out.print("Not power of two");
    }
}
