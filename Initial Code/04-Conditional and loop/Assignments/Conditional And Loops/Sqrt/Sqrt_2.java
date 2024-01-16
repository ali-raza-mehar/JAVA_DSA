import java.util.Scanner;

public class Sqrt_2 {
    public static void main(String[] args) {
        int num;
        double sqrt;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        sqrt = Math.sqrt((double) num);
        System.out.print((int) sqrt);
    }
}
