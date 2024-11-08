package Notes.Notes_Code.Recursion_Basics_01;

public class GDC {
    static int findGCD(int[] nums) {
        // firstly find minimum
        int a = nums[0];
        int b = nums[0];
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] > a)
                a = nums[i];

            if (nums[i] < b)
                b = nums[i];
        }
        return ans(a, b);
    }

    static int ans(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = b % a;
            a = temp;
        }
        return a;
    }
}
