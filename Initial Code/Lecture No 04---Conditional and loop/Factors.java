import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int num;
        int count;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = in.nextInt();
        System.out.println("Number: " + num);
        System.out.print("Factors: ");
        count = 1;
        while (count <= num) {
            if (num % count == 0) {
                System.out.print(count);
                if (count < num)
                    System.out.print(" , ");
            }
            count++;
        }
    }
}
