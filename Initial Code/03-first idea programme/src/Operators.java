import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {

        int num1 , num2;
        String operator1;
        char operator2;
        double division;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.println("Enter the math operator that you want to apply on numbers.");
        System.out.print("i.e--> + , - , / , * :: ");
        operator1 = input.next();
        operator2 = operator1.charAt(0);
        if(operator2 == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)  );
        }
        else if(operator2 == '-') {
            System.out.println(num1 + " - " + num2 + " = "  + (num1 - num2)  );
        }
        else if(operator2 == '*') {
            System.out.println(num1 + " * " + num2 + " = "  + (num1 * num2)  );
        }
        else if(operator2 == '/') {
            division =  ((double) (num1) / (double) (num2));
            System.out.println(num1 + " / " + num2 + " = " + division  );
        }
        else {
            System.out.println("Wrong Operator");
        }

    }
}
