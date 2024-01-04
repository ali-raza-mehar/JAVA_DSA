import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number for check even or odd: ");
        num = in.nextInt();
        if(num % 2 == 0)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }
}
