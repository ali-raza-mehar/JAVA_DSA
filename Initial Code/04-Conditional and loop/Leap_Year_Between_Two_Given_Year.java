import java.util.Scanner;

public class Leap_Year_Between_Two_Given_Year {
    public static void main(String[] args) {
        int startYear, endYear;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the start year: ");
        startYear = in.nextInt();
        System.out.print("Enter the end year: ");
        endYear = in.nextInt();
        System.out.println("Leap years between your providing years:" );
        if(endYear > startYear){
            for(startYear = startYear + 1; startYear < endYear; startYear++){
                if (startYear % 4 == 0 && (startYear % 100 != 0 || startYear % 400 == 0)) {
                    System.out.println(startYear);
                }
            }
        }
        else {
            System.out.println("End year must be greater than start year!!");
        }
    }
}
