import java.util.Scanner;

public class Tricoonaci {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find tricco series: ");
        num = in.nextInt();
        int ans = isTricco(num);
        System.out.println(ans);
        in.close();
    }

    static int isTricco(int num) {
        int a, b, c, d, count;
        a = 0;
        b = 0;
        c = 1;
        d = 0;
        count = 3;
        if (num == 0 || num == 1)
            return num;
        else if (num == 2)
            return 1;
        else {
            while (count <= num) {
                d = a + b + c;
                a = b;
                b = c;
                c = d;
                count++;
            }
        }
        return d;

    }
}
