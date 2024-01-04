import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int count = 1;
        int mul = 1;
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = in.nextInt();
        System.out.print("Factorial: ");
        while (count <= num){
            mul = mul * count;
            count++;
        }
        System.out.print(mul);
    }
}
