import java.util.Scanner;

public class NumberFinder {
    public static void main(String[] args) {
        String number;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = in.next();
        System.out.print("Enter the digit that you want to find how many times it repeats: ");
        String finder1 = in.next();
        char finder2 = finder1.charAt(0);
        for (int i = 0; i < number.length(); i++) {
            char currentChar = number.charAt(i);
            if (finder2 == currentChar) {
                count++;
            }
        }
        System.out.println("Digit = " + finder2);
        System.out.println("Repeats = " + count + " times" );
    }
}
