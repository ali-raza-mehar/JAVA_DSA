import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        int base , height;
        long area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of parallelogram: ");
        base = in.nextInt();
        System.out.print("Enter the height of parallelogram: ");
        height = in.nextInt();
        area = ((long) base * height);
        System.out.println("The area of the parallelogram is: " + area);
    }
}
