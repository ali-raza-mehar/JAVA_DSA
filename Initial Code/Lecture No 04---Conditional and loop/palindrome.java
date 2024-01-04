import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String str1 , str2 = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string to check palindrome or not: ");
        str1 = in.next().trim();
        int count = (str1.length() - 1);
        while (count >= 0){
            str2 = str2 + str1.charAt(count);
            count--;
        }
        str2 = str2.trim();
        if(str1.equals(str2)){
            System.out.print("Palindrome");
        }
        else {
            System.out.print("Not palindrome");
        }

    }
}
