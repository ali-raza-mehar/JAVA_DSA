import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        int s;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of any side of square: ");
        s = in.nextInt();
        int perimeter = 4 * s;
        System.out.print("The perimeter of square is: " + perimeter);
    }
}
