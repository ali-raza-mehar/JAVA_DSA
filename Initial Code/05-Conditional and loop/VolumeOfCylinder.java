import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        int radius , height , volume;
        float pi = 3.14f;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of cylinder: ");
        radius = in.nextInt();
        System.out.print("Enter the height of cylinder: ");
        height = in.nextInt();
        volume = (int) (pi * Math.pow(radius , 2) * height);
        System.out.println("The volume of cylinder is: " + volume);
    }
}
