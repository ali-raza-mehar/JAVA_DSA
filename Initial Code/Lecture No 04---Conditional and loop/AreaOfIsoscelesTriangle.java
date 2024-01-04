import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        double area;
        float a , base;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of isosceles triangle: ");
        base = in.nextFloat();
        System.out.print("Enter the length of one of equal sides of isosceles triangle: ");
         a = in.nextFloat();
         area = (base * Math.sqrt((4 * Math.pow(a , 2 )) - (Math.pow(base , 2)))) / 4;
        System.out.println("Therefore, the area of the isosceles triangle is " + area +  " square units.");

    }
}
