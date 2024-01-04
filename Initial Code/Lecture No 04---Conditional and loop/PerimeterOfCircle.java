import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        float pi = 3.14f;
        int radius;
        int perimeter;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        radius = in.nextInt();
        perimeter = (int) (2 * pi * radius);
        System.out.print("The perimeter of circle is: " + perimeter);
    }
}
