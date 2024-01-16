import java.util.Scanner;

public class SumTill0 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        int count = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = in.nextInt();
        while (count > 0){
            if(num != 0){
                sum = sum + num;
                System.out.print("Enter the number: ");
                num = in.nextInt();
            }
            else {
                break;
            }
        }
        System.out.print("Sum = " + sum);
    }
}
