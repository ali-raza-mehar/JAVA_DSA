import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        int s1 , s2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of first two opposite sides of parallelogram: ");
        s1 = in.nextInt();
        System.out.print("Enter the length of second two opposite sides of parallelogram: ");
        s2 = in.nextInt();
        int perimeter = ((2 * s1) + (2 * s2));
        System.out.print("The perimeter of parallelogram is: " + perimeter);
    }
}
