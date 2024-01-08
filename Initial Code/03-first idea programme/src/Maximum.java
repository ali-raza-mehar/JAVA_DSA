import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {

        int num1 , num2 , max;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        max = num1;
        if(max > num2){
            System.out.println(num1 + " is maximum");
        }
        else {
            max = num2;
            System.out.println(max + " is maximum");
        }
    }
}
