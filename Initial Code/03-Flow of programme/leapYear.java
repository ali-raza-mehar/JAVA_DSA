import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        int year;
        System.out.print("Enter the year to check leap or not:");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
        if(year % 4 == 0){
            if (year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap");
                }
                else {
                    System.out.println("Not leap");
                }
            }
            else {
                System.out.println("leap");
            }
        }
        else {
            System.out.println("Not leap");
        }
    }
}
