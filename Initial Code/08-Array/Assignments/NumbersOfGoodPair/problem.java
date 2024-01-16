import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = in.nextInt();
        int[] nums = new int[length];
        System.out.print("Enter the " + length + " elements in array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int ans = goodPairs(nums);
        System.out.print("Good pairs : " + ans);
        in.close();
    }

    static int goodPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i < j)
                    if (nums[i] == nums[j])
                        count++;
            }
        }
        return count;
    }
}