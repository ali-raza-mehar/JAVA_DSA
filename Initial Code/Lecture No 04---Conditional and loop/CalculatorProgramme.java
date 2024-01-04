import java.util.Scanner;

public class CalculatorProgramme {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            char op;
            int a , b , ans = 0;
            float ansFloat = 0;
            boolean divide = false;

            // for input
            System.out.print("Enter operator: ");
            op = in.next().trim().charAt(0);


            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter first number: ");
                a = in.nextInt();
                System.out.print("Enter second number: ");
                b = in.nextInt();

                if(op == '+')
                    ans = a + b;
                if(op == '-')
                    ans = a - b;
                if(op == '*')
                    ans = a * b;
                if(op == '%')
                    ans = a % b;
                if(op == '/'){
                    if(b != 0){
                        ansFloat = (float) a / (float) b;
                        divide = true;
                    }
                    else {
                        System.out.println(a + " " + op + " " + b + " = " + "∞");

                    }
                }
                if(divide){
                    System.out.println(a + " " + op + " " + b + " = " + ansFloat);
                }
                else if(op == '+' || op == '-' || op == '*' || op == '%')  {
                    System.out.println(a + " " + op + " " + b + " = " + ans);
                }
            }
            else if (op == 'x' || op == 'X') {
                break;
            }
            else {
                System.out.println("Invalid operation!!");
            }

        }
    }
}
