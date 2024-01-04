import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        int length , width , height , volume;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of pyramid: ");
        length = in.nextInt();
        System.out.print("Enter the width of pyramid: ");
        width = in.nextInt();
        System.out.print("Enter the height of pyramid: ");
        height = in.nextInt();
        volume = (length * width * height) / 3;
        System.out.println("The volume of pyramid is: " + volume);
    }
}
