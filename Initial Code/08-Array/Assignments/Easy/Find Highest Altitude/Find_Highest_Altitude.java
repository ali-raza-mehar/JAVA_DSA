
import java.util.Scanner;

public class Find_Highest_Altitude {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = in.nextInt();
        int[] arr = new int[length];
        System.out.print("Enter the " + length + " elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(largestAltitude(arr));
        in.close();
    }

    static int largestAltitude(int[] gain) {
        int[] newArray = new int[gain.length + 1];
        int sum;
        newArray[0] = 0;
        newArray[1] = gain[0];
        int j = 1;
        for (int i = 1; i < gain.length; i++) {
            sum = newArray[j] + gain[i];
            j++;
            newArray[j] = sum;
        }
        // System.out.println(Arrays.toString(newArray));
        int max = newArray[1];
        for (int i = 2; i < newArray.length; i++) {
            if (newArray[i] > max)
                max = newArray[i];
        }
        if (max > 0)
            return max;
        else
            return 0;
    }
}