import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        int length , width;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = in.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        width = in.nextInt();
        int perimeter = 2 * (length + width);
        System.out.print("The perimeter of rectangle is: " + perimeter);
    }
}
