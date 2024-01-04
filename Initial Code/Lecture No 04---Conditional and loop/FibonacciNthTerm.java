import java.util.Scanner;

public class FibonacciNthTerm {
    public static void main(String[] args) {
        int bBeforeSum;
        int aPrevious = 0;
        int bNext = 1;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the term to find in fibonacci series:");
        n = in.nextInt();
        int count = 2;
        System.out.print(aPrevious + "," + bNext + "," );
        while (count <= n){
            bBeforeSum = bNext;
            bNext = bNext + aPrevious;
            aPrevious = bBeforeSum;
            System.out.print((bNext) + ",");
            count++;
        }
        System.out.println("");
        System.out.println(bNext);
    }
}
