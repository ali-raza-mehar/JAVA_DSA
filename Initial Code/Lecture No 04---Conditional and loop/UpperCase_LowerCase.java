import java.util.Scanner;

public class UpperCase_LowerCase {
    public static void main(String[] args) {
        char check = 'A' , convertedChar;
        String userChar;
        boolean condition;
        condition = false;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter character to check either it is upper case or lower case: ");
        userChar = in.next();
        convertedChar = userChar.charAt(0);
//        for (int i = 1; i <= 26 ; i++){
//            if (convertedChar == check) {
//                condition = true;
//                break;
//            }
//            check += 1;
//        }
//        if(condition)
//            System.out.print("Upper case");
//        else
//            System.out.print("lower case");

         if(convertedChar >= 'a' && convertedChar <= 'z')
             System.out.println("Lower case");
         else
             System.out.println("Upper case");

    }
}
