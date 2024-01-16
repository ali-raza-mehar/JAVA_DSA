
import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        long num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = in.nextInt();
        long ans = isSqaure(num);
        if (ans == -1)
            System.out.print("Num is not perfect square of any number");
        else
            System.out.print("Number is perfect sqaure of " + ans);
        in.close();
    }

    static long isSqaure(long num) {
        for (long i = 1; i <= num; i++) {
            if (i * i == num)
                return i;
        }
        return -1;
    }
}
