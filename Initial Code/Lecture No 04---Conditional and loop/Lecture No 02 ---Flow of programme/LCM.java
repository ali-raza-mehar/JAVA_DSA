// LCM --> aisa number mil jaye numbering jis pai dono divide ho jain

import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        int num1 , num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        for(int sp = 1; sp <= (num1 * num2); sp++){
             if(sp % num1 == 0 && sp % num2 == 0) // see the common multiple
             {
                 System.out.println("The LCM is " + sp);
                 break;
             }
        }
    }
}
