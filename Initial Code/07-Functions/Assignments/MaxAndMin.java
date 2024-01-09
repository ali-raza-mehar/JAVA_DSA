import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = in.nextInt();
        System.out.print("Enter second number: ");
        b = in.nextInt();
        System.out.print("Enter third number: ");
        c = in.nextInt();
        minimum(a, b, c);
        maximum(a, b, c);

        in.close();
    }

    static void minimum(int a, int b, int c) {
        int min;
        min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        System.out.println("Miniumum = " + min);
    }

    static void maximum(int a, int b, int c) {
        int max;
        max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        System.out.println("Maximum = " + max);
    }

}
