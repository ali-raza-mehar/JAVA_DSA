import java.util.Arrays;
import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = in.nextInt();
        int[] nums = new int[length];
        System.out.print("Enter the value of n it should be the half of your length: ");
        int n = in.nextInt();
        System.out.print("Enter " + length + "  elements in array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int[] newArray = shuffle(nums, n);
        System.out.println(Arrays.toString(newArray));
        in.close();
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ar1 = new int[n];
        int[] ar2 = new int[n];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = nums[i];
        }
        int currentIndex = ar1.length;
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = nums[currentIndex];
            currentIndex++;
        }
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));

        int[] newArray = new int[ar1.length + ar2.length];
        int newArrayIndex = 0;
        for (int i = 0; i < ar1.length; i++) {
            newArray[newArrayIndex] = ar1[i];
            newArrayIndex = newArrayIndex + 2;
        }
        int AfterOnePassIndex = 1;
        for (int i = 0; i < ar2.length; i++) {
            newArray[AfterOnePassIndex] = ar2[i];
            AfterOnePassIndex = AfterOnePassIndex + 2;
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}