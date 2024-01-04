import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        int s;
        int perimeter;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the one side of the Equilateral Triangle: ");
        s = in.nextInt();
        perimeter = (3 * s);
        System.out.print("The perimeter of Equilateral Triangle  is: " + perimeter);
    }
}
