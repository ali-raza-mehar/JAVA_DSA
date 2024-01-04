import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int reminder, n2, n1, count, sum;
        count = 0;
        sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to check Armstorng: ");
        n1 = in.nextInt();
        n2 = n1;
       int n3 = n1;
        while (n2 > 0){
             reminder = n2 % 10;
             count++;
             n2 = n2 / 10;
        }
        while (n1 > 0){
            reminder = n1 % 10;
            sum = (int) (sum + Math.pow(reminder, count));
            n1 = n1 / 10;
        }
        if(sum == n3)
            System.out.println(n3 + " is Armstrong number");
        else
            System.out.println(n3 + " is not Armstrong number");
    }
}
