import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        int tempC;
        float tempF;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in celsius: ");
        tempC = in.nextInt();
        tempF = ((float) (tempC * 9) / 5) + 32;
        System.out.println(tempC + "°C" + " = " + tempF + "°F");
    }
}
