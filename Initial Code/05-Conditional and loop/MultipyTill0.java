import java.util.Scanner;

public class MultipyTill0 {
    public static void main(String[] args) {
        int num;
        int mul = 1;
        int count = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = in.nextInt();
        while (count > 0){
            if(num != 0){
                mul = mul * num;
                System.out.print("Enter the number: ");
                num = in.nextInt();
            }
            else {
                break;
            }
        }
        System.out.print("Multiplication = " + mul);
    }
}
