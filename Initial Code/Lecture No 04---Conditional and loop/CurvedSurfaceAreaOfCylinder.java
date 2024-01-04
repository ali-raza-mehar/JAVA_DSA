import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        float pi = 3.14f;
        int radius , height;
        int curvedSurfaceArea;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of cylinder: ");
        radius = in.nextInt();
        System.out.print("Enter the height of cylinder: ");
        height = in.nextInt();
        curvedSurfaceArea = (int) (2 * pi * radius * height);
        System.out.print("The perimeter of circle is: " + curvedSurfaceArea);
    }
}
