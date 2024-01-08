import java.util.Scanner;

public class VolumeOfPrism
{
    public static void main(String[] args) {
        int length , width , height , volume;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of prism: ");
        length = in.nextInt();
        System.out.print("Enter the width of prism: ");
        width = in.nextInt();
        System.out.print("Enter the height of prism: ");
        height = in.nextInt();
        volume = (length * width * height);
        System.out.println("The volume of prism is: " + volume);
    }
}
