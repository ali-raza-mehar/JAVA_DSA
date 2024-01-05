

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        int year;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year to check leap or not: ");
        year = in.nextInt();
        if(year % 4 == 0) {
            if (year % 400 == 0)
                System.out.println("leap!!");
            else if (year % 100 == 0){
                 System.out.println("Not Leap year!!");
            }
            else
                System.out.println("leap year!!");
        }
        else
            System.out.println("Not leap Year!!");
    }

}

