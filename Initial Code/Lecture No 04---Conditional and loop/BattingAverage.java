import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        float scored, noOfTimeDismiss, average;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the score of bastman: ");
        scored = in.nextFloat();
        System.out.print("Enter the number of times dismissed: ");
        noOfTimeDismiss = in.nextFloat();
        average = scored / noOfTimeDismiss;
        System.out.print(average);
    }
}
