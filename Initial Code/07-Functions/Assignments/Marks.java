import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int marks;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        marks = in.nextInt();
        Grade(marks);
        in.close();
    }

    static void Grade(int marks) {
        if (marks >= 91 && marks <= 100)
            System.out.println("A grade");
        else if (marks >= 81 && marks <= 90)
            System.out.println("B grade");
        else if (marks >= 71 && marks <= 80)
            System.out.println("B grade");
        else if (marks >= 61 && marks <= 70)
            System.out.println("C grade");
        else if (marks >= 51 && marks <= 60)
            System.out.println("D grade");
        else if (marks >= 41 && marks <= 50)
            System.out.println("D grade");
        else if (marks <= 40)
            System.out.println("Fail");

    }
}
