
import java.util.Scanner;

public class MaxFromArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many elements you want in array: ");
        int length = in.nextInt();
        int[] arr = new int[length];
        getInput(arr, length);
        getOutput(arr);
        max(arr);
        min(arr);
        in.close();
    }

    private static void getOutput(int[] arr) {
        System.out.print("The elements that you entered in array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void getInput(int[] arr, int length) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter " + length + " elements in array: ");
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println();
        in.close();
    }

    private static void min(int[] arr) {
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum)
                minimum = arr[i];
        }
        System.out.print("The (minimum) element from the array that you entered is " + "(" + minimum + ")");
        System.out.println();
    }

    static void max(int[] arr) {
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum)
                maximum = arr[i];
        }
        System.out.print("The (maximum) element from the array that you entered is " + "(" + maximum + ")");
        System.out.println();
    }

}
