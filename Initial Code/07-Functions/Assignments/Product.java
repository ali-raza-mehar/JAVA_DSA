import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = in.nextInt();
        System.out.print("Product = " + product(num));
        in.close();
    }

    static int product(int num) {
        int pro = 1;
        for (int i = 1; i <= num; i++) {
            pro = pro * i;
        }
        return pro;
    }
}
