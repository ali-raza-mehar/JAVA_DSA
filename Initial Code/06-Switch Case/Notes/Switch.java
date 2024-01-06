import java.util.Scanner;
import java.math.BigInteger;
public class Switch {
    public static void main(String[] args) {
        int a, b;
        long factorialA = 1;
        long factorialB = 1;
        char op;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = in.nextInt();
        System.out.print("Enter first number: ");
        b = in.nextInt();
        System.out.print("Enter the operator that you want to apply: ");
        String op2 = in.next();
        op = op2.charAt(0);
        switch (op){
            case '+' -> {
                int addition = a + b;
                System.out.print("Addition = " + addition);
            }
            case '-' -> {
                int subtraction = a - b;
                System.out.print("Subtraction = " + subtraction);
            }
            case '*' -> {
                int mul = a * b;
                System.out.print("Mul = " + mul);
            }
            case '/' -> {
                float division = (float) a / (float) b;
                System.out.print("Division = " + division);
            }
            case '%' -> {
                float module = (float) a % (float) b;
                System.out.print("Module = " + module);
            }
            case '^' -> {
                System.out.print("Enter the order to calculate power either a^b or b^a: ");
                String order = in.next();
                order = order.trim();
                switch (order){
                    case "a^b" -> {
                        double power = Math.pow(a,b);
                        System.out.print(a + "^" + b + " = " + power );
                    }
                    case "b^a" -> {
                        double power2 = Math.pow(b,a);
                        System.out.print(b + "^" + a + " = " + power2 );
                    }
                    default -> System.out.print("Invalid order!!");
                }
            }
            case '!' ->{
                System.out.println("Enter the choice:");
                System.out.println("1.)Factorial for 1st number");
                System.out.println("2.)Factorial for 2nd number");

                int choice = in.nextInt();
                switch (choice){
                    case 1 -> {
                        for (int i = 1; i <= a; i++) {
                            factorialA = factorialA * i;
                        }
                        System.out.print(a + "!" + " = " + factorialA);
                    }
                    case 2 -> {
                        for (int i = 1; i <= b; i++) {
                            factorialB = factorialB * i;
                        }
                        System.out.print(b + "!" + " = " + factorialB);
                    }
                    default -> System.out.print("Invalid choice!!");
                }
            }
            default -> System.out.print("Invalid operator!!");
        }
    }
}
