import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        int s;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of any side of cube: ");
        s = in.nextInt();
        int cubeSurfaceArea = (int) (6 * Math.pow(s , 2));
        System.out.print("The Total Surface Area Of Cube is: " + cubeSurfaceArea);
    }
}
