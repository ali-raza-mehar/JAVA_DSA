import  java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        String num1 , num2 , sum;
        Scanner input = new Scanner(System.in);
        num1 = input.next();
        num2 = input.next();
        sum = num1 + " " + num2;
        System.out.println(sum.charAt(0));
    }
}