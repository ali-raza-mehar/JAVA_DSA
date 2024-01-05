import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
         int diameter , choice;
         float pi =  3.14F;
         float radius , areaOfCircle , circumference;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of diameter: ");
        diameter = in.nextInt();
        System.out.println("Enter the choice:");
        System.out.println("1:Area of circle");
        System.out.println("2: Circumference of circle");
        choice = in.nextInt();
        radius = (float) (diameter) / 2;
        if( choice == 1){
        areaOfCircle = pi * (radius * radius);
        System.out.print("The area of circle is " + areaOfCircle + "square units");
        }
        else {
             circumference = (2 * pi * radius);
            System.out.println("The circumference of circle is " + circumference);
        }
    }
}
