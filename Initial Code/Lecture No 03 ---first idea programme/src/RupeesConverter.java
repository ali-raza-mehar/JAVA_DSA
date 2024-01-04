import java.util.Scanner;
import java.text.DecimalFormat;
public class RupeesConverter {
    public static void main(String[] args) {
        int dollars;
        float rupees = 288.59f;
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.print("Enter the dollars: ");
        dollars = input.nextInt();
        rupees =  (dollars * rupees);
        String formattedRupees = decimalFormat.format(rupees);
        System.out.println(dollars + "$" + " = " + formattedRupees + "pkr");
    }
}
