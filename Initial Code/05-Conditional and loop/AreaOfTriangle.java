import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        float base , height;
        float area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base in units: ");
        base = in.nextFloat();
        System.out.print("Enter the height in units: ");
        height = in.nextFloat();
        area =   (base * height) / 2;
        System.out.println("Therefore, the area of the triangle is " + area +  " square units.");
    }
}
