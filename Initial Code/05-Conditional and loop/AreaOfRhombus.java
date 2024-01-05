import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        int d1 , d2 , area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of first short diagonal: ");
        d1 = in.nextInt();
        System.out.print("Enter the length of second long diagonal: ");
        d2 = in.nextInt();
        area = (d1 * d2) / 2;
        System.out.println("The area of rhombus is: " + area);
    }
}
