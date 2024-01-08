import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6 };
        change(num);
        System.out.println("The chnages that you have made");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    static void change(int[] num) {
        System.out.print("Enter five digits in array: ");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        in.close();
    }
}
