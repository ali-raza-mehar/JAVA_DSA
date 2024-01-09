import java.util.Scanner;

public class SumOfNnatural {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = in.nextInt();
        System.out.print("Sum = " + Sum(num));

        in.close();
    }

    static int Sum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
