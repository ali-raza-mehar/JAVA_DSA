import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        int s;
        long area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the one side of the triangle: ");
        s = in.nextInt();
        area =  (long)((Math.sqrt(3) * Math.pow(s , 2)) / 4);
        System.out.print("The area of equilateral triangle is: " + area);
    }
}
