import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int num1 , num2 , num3 , max;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        max = num1;
        if(max < num2)
            max = num2;
        if(max < num3)
            max = num3;
        System.out.println("The maximum = " + max);
    }
}
