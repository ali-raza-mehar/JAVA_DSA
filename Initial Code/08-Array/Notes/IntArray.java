
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class IntArray {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three digits in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Before changing: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        ChangeArray(arr);
        System.out.println("After changing: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // array(arr);
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter five elements in array: ");
        // for (int index = 0; index < array.length; index++) {
        // array[index] = in.nextInt();
        // }
        // for (int index = 0; index < array.length; index++) {
        // System.out.println(array[index]);
        // }
        // in.close();
    }

    // static void array(int[] arr) {
    // Scanner in = new Scanner(System.in);
    // System.out.print("Enter three digit in array: ");
    // for (int index = 0; index < arr.length; index++) {
    // arr[index] = in.nextInt();
    // }
    // String str1 = " ";
    // for (int i = 0; i < arr.length; i++) {
    // str1 = str1 + arr[i];
    // }
    // str1 = str1.trim();
    // int value = Integer.parseInt(str1);
    // System.out.println(value);
    // value = value + 1;
    // int reminder;
    // int index = 0;
    // System.out.println(value);
    // }

    static void ChangeArray(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter again three digits in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }
}