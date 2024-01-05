import java.util.Scanner;

public class Minimum2 {
    public static void main(String[] args) {
        int num1 , num2 , num3 , min;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        min = num1;
        if(num2 < min)
            min = num2;
        if(num3 < min)
            min = num3;
        System.out.println("The minimum = " + min);
    }
}
