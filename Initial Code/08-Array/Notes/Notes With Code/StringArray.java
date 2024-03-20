
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        // strings are imutable you cannot change them
        String[] Degree = new String[5];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the degree of five students: ");
        for (int i = 0; i < Degree.length; i++) {
            Degree[i] = in.next();
        }
        System.out.println("Before changing: ");
        for (int i = 0; i < Degree.length; i++) {
            System.out.print(Degree[i] + " ");
        }
        System.out.println();
        Change(Degree);
        System.out.println("After changing: ");
        for (int i = 0; i < Degree.length; i++) {
            System.out.print(Degree[i] + " ");
        }
        in.close();
    }

    static void Change(String[] degree) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the degree of five students: ");
        for (int i = 0; i < degree.length; i++) {
            degree[i] = in.next();
        }
        in.close();
    }

}
