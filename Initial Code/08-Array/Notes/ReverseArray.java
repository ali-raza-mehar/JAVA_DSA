
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array mean how much element that you want to entered: ");
        int length = in.nextInt();
        int[] arr = new int[length];
        System.out.print("Enter " + length + " elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The array that you entered is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int j = 0;
        int temp;
        int ep = arr.length;
        ep = ep / 2;
        for (int i = (arr.length - 1); i >= ep; i--) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j++;
        }
        System.out.println("The reverse array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}
