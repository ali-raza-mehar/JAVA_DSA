import java.util.Scanner;

public class ReverseWithNumber {
    public static void main(String[] args) {
        int number , reminder , ans = 0;
        String Reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = in.nextInt();
        System.out.println("Number = " + number);
        while (number > 0){
            reminder = number % 10;
            ans = (ans * 10) + reminder; // To get Reverse
            number = number / 10;
        }
        System.out.println("Reverse = " + ans);
    }
}
