package Assignments.Smallest_Letter_Greater_Than_Target;

public class Smallest_letter {
    static char ceilingNumber(char[] nums, char target) {
        int sp = 0;
        int ep = nums.length - 1;
        while (sp <= ep) {
            int mid = sp + (ep - sp) / 2;

            if (target > nums[mid]) {
                sp = mid + 1;
            } else if (target < nums[mid]) {
                ep = mid - 1;
            }
        }
        return nums[sp % nums.length];
    }

    public static void main(String[] args) {
        char[] nums = { 'c', 'f', 'j' };
        System.out.println(ceilingNumber(nums, 'z'));
    }
}
