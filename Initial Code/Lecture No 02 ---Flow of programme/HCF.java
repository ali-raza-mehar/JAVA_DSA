import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        int num1 , num2 , endpoint , HCF = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        if( num1 > num2)
            endpoint = num2;
        else
            endpoint = num1;
        for(int sp = 1; sp <= endpoint ; sp++){
            if( num1 % sp == 0 && num2 % sp == 0){
                HCF = sp;
            }
        }
        System.out.println("The HCF is " + HCF);
    }
}
