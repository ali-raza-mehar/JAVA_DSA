import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = in.next();
        greeting(name);
        in.close();
    }

    static void greeting(String name) {
        System.out.println("Hello!! " + name);
    }
}
