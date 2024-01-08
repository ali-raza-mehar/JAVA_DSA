import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        int num, negativeSum, positiveEvenSum, positiveOddSum;
        negativeSum = 0;
        positiveEvenSum = 0;
        positiveOddSum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = in.nextInt();
        while (num != 0){
            if(num > 0){
                if(num % 2 != 0){
                    positiveOddSum = positiveOddSum + num;
                } else{
                    positiveEvenSum = positiveEvenSum + num;
                }
            }
            if(num < 0)
                negativeSum = negativeSum + num;
            System.out.print("Enter number: ");
            num = in.nextInt();
        }
        System.out.println("Sum of negative number = " + negativeSum);
        System.out.println("Sum of positive even number = " + positiveEvenSum);
        System.out.println("Sum of positive odd number = " + positiveOddSum);
    }
}
