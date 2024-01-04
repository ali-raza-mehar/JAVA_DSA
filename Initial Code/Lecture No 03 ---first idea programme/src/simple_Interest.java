import java.util.Scanner;
public class simple_Interest {
    public static void main(String[] args) {

        int principle , rate , timePeriod , simpleInterest;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial amount of money: ");
        principle  = input.nextInt();
        System.out.print("Enter the time period that has taken for loan: ");
        timePeriod  = input.nextInt();
        System.out.print("Enter the rate of interest per period: ");
        rate  = input.nextInt();
        simpleInterest = (principle * timePeriod * rate) / 1000;
        System.out.println("Your simple interest is " + "$" + simpleInterest);


    }
}
