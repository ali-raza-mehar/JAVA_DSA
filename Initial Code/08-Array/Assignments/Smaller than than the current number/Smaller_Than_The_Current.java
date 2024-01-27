import java.util.Arrays;
import java.util.Scanner;

public class Smaller_Than_The_Current {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = in.nextInt();
        int[] nums = new int[length];
        System.out.print("Enter the " + length + " elements in array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int[] ans = smallerThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
        in.close();
    }

    static int[] smallerThanCurrent(int[] nums) {
        int[] cloneArray = nums.clone();
        int count;
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < cloneArray.length; j++) {
                if (cloneArray[j] < nums[i])
                    count++;
            }
            newArray[i] = count;
        }
        return newArray;
    }
}