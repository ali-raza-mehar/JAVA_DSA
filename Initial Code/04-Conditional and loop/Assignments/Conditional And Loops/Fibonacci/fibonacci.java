import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a, b, num, c;
        a = 0;
        b = 1;
        c = 0;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        int count = 2;
        while (count <= num){
              c = a + b;
              a = b;
              b = c;
              count++;
        }
        System.out.print(c);
    }
}
