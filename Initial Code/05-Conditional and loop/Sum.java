import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum, num;
        sum = 0;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        for (int i = 1; i <= num ; i++) {
            sum = sum + i;
        }
        System.out.print(sum);
    }
}
