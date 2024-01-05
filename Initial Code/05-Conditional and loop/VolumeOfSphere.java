import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        int radius , volume;
        float pi = 3.14f;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of sphere: ");
        radius = in.nextInt();
        volume = (int) (4 * pi * Math.pow(radius , 3)) / 3;
        System.out.println("The volume of sphere is: " + volume);
    }
}
