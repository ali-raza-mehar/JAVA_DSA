import java.util.Scanner;
/*
   1.)LCM:LCM mean the least common multiply of two number.And the two numbers will divide the least common multiply.
   2,3
   2-->2,4,6,8,5,10...
   3-->3,6,9,12
   the LCM = 6 because both 2 and 3 divide the 6.
   multiply factor that will divide on both.

   2.)HCF:Highest common factor.
   in HCF we will find the factors and the last factors of both number that will same will HCF.
   4,6
   4-->1,2,4
   6-->1,2,3,6
   2 will HCF.
   we find the last factor
 */

public class HCFAndLCM {
    public static void main(String[] args) {
        int choice, num1, num2, LCM, HCF = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers to find HCF or either LCM: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println("Enter choice:");
        System.out.println("1.)For LCM");
        System.out.println("2.)For HCF");
        choice = in.nextInt();
        if(choice == 1)
        {
            for (int i = 1; i > 0 ; i++) {
                if((i % num1 == 0) && (i % num2 == 0)){
                     LCM = i;
                    System.out.print("LCM = " + LCM);
                     break;
                }
            }
        } else if (choice == 2) {
            for (int i = 1; i < num2; i++) {
                if((num1 % i == 0) && (num2 % i == 0)){
                    HCF = i;
            }
        }
            System.out.print("HCF = " + HCF);
        }
        else
            System.out.print("Invalid choice!!!");
}
}
