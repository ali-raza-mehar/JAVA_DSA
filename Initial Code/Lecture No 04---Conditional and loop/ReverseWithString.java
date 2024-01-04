import java.util.Scanner;

public class ReverseWithString {
    public static void main(String[] args) {
        String number , reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = in.next();
        int i = (number.length()-1);
        while (i >= 0) {
            reverse = reverse + number.charAt(i);
            i--;
        }
        reverse = reverse.trim();
        System.out.println("Number = " + number);
        System.out.println("Reverse = " + reverse);
    }
}
