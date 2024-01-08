import java.util.Scanner;
public class Minimum {
        public static void main(String[] args) {

            int num1 , num2 , min;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first number: ");
            num1 = input.nextInt();
            System.out.print("Enter second number: ");
            num2 = input.nextInt();
            min = num1;
            if(min < num2){
                System.out.println(num1 + " is minimum");
            }
            else {
                min = num2;
                System.out.println(num2 + " is minimum");
            }
        }
    }
