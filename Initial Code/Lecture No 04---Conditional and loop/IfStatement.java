import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        int salary, totalSalary;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        salary = in.nextInt();
        if ((salary >= 80000) && (salary <= 100000)) {
            totalSalary = 10000 + salary;
            System.out.println("Your total salary is " + totalSalary);
        } else if ((salary < 80000) && (salary >= 50000)) {
            totalSalary = 5000 + salary;
            System.out.println("Your total salary is " + totalSalary);
        } else {
            System.out.println("Your salary is very less, so you are not eligible for a bonus");
        }
    }
}
