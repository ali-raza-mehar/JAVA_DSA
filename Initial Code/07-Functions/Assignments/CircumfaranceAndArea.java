import java.util.Scanner;

public class CircumfaranceAndArea {
    static final float pi = 3.14f;

    public static void main(String[] args) {
        calc();
    }

    static void calc() {
        double area, circumfarance;
        int radius, choice;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the choice:");
        System.out.println("1.)Area of circle");
        System.out.println("2.)Circumfarance of circle");
        choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                radius = in.nextInt();
                area = pi * Math.pow(radius, 2);
                System.out.println("Area = " + area);
                break;
            case 2:
                System.out.print("Enter radius: ");
                radius = in.nextInt();
                circumfarance = 2 * pi * radius;
                System.out.println("Circumfarance = " + circumfarance);
                break;
            default:
                System.out.println("Invalid choice!!!");
        }
        in.close();
    }
}
