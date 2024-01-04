import  java.util.Scanner;
public class table {
    public static void main(String[] args) {
       int num;
       Scanner input = new Scanner(System.in);
        System.out.print("Enter number for table:");
       num = input.nextInt();
       for( int sp = 1; sp <= 10 ; sp++){
           System.out.println(num + " * " + sp + " = " + (num *sp) );
       }
    }
}
