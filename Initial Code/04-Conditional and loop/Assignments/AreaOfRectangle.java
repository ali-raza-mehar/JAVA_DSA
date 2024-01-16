import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        int height , width;
        int area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height in units: ");
        height = in.nextInt();
        System.out.print("Enter the width in units: ");
        width = in.nextInt();
        area = (height * width);
        System.out.println("Therefore, the area of the rectangle is " + area +  " square units.");
    }
}
