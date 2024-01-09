
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = in.nextInt();
        if (isEven(num)) {
            System.out.print("Number is even");
        } else
            System.out.print("Number is odd");
        in.close();
    }

    static boolean isEven(int num) {
        return (num % 2 == 0);
    }
}
