import java.util.Scanner;
import java.text.DecimalFormat;
public class DollarConverter {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        int rupees ;
        double dollars;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Pakistani Rupees: ");
        rupees = input.nextInt();
        dollars = 288.59;
        dollars = rupees / dollars;
        String formattedDollars = decimalFormat.format(dollars);
        System.out.println( formattedDollars);
        System.out.println(rupees + " rupees" + " = " + formattedDollars + " $ US dollars");
    }
}