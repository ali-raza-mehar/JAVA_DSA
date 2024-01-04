import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        int s;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of any side of rhombus: ");
        s = in.nextInt();
        int perimeter = 4 * s;
        System.out.print("The perimeter of rhombus is: " + perimeter);
    }
}
