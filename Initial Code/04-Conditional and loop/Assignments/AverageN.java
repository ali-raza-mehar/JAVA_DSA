import java.util.Scanner;

public class AverageN {
    public static void main(String[] args) {
        float average;
        int count , sum = 0 , num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to calculate average:");
        num = in.nextInt();
        if(num >= 0){
        for ( count = 1; count <= num ; count++) {
            sum = sum + count;
        }
        average =(float) sum / (float) num;
        System.out.print(average);
    }
        else {
            for(count = -1; count >= num; count--){
                sum = sum + count;
            }
            average = (float) sum / (float) num;
            System.out.print("-" + average);
        }

}
}

