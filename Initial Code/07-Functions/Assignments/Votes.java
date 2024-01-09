import java.util.Scanner;

public class Votes {
    public static void main(String[] args) {
        int age;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = in.nextInt();
        if (eligilbe(age))
            System.out.println("You are eligilbe for vote!!");
        else
            System.out.println("You are not eligilbe for vote!!");
        in.close();
    }

    static boolean eligilbe(int age) {
        return (age >= 18);
    }
}
