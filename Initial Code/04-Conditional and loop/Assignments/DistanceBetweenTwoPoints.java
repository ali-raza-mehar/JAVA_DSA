import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        double x1, y1, x2, y2, distance;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first two points: ");
        x1 = in.nextInt();
        y1 = in.nextInt();
        System.out.print("Enter second two points: ");
        x2 = in.nextInt();
        y2 = in.nextInt();
        distance = Math.sqrt( ( Math.pow( x2 - x1, 2 ) + Math.pow( y2 - y1, 2 ) ) );
        System.out.print(distance);
    }
}
