import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String str1, str2 = " ";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string for reverse: ");
        str1 = in.next();
        str1 = str1.trim();
        int currentIndex = str1.length() - 1;
        while (currentIndex >= 0){
             str2 = str2 + str1.charAt(currentIndex);
             currentIndex--;
        }
        System.out.println("Original = " + str1 );
        System.out.print("Reverse = " + str2 );
    }
}
