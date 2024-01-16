import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        int radius , height , volume;
        float pi = 3.14f;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of cone: ");
        radius = in.nextInt();
        System.out.print("Enter the height of cone: ");
        height = in.nextInt();
        volume = (int) (pi * Math.pow(radius , 2) * height) / 3;
        System.out.println("The volume of cone is: " + volume);
    }
}
