package Assignments.Meduim.Single_Element_Array;

public class Single {
    static int singleNonDuplicate(int[] nums) {
        if (nums.length < 2)
            return nums[0];
        int sp = 0;
        int ep = nums.length - 1;
        while (sp <= ep) {
            // sp and ep will equal it means they are point toward the single element just
            // return it
            // {3, 3, 4, 5, 5};
            if (sp == ep) {
                return nums[sp];
            }

            if (ep > sp && nums[ep] != nums[ep - 1])
                return nums[ep];
            else if (ep > sp && nums[ep] == nums[ep - 1])
                ep -= 2;

            if (sp < ep && nums[sp] != nums[sp + 1])
                return nums[sp];
            else if (sp < ep && nums[sp] == nums[sp + 1])
                sp += 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 3, 4, 4, 5, 5 };
        // int[] nums = { 1, 1, 2, 3, 3 };
        // int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        // int[] nums = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 8, 8 };
        // int[] nums = { 5, 5, 6, 6, 8, 8, 10, 10, 12 };
        // int[] nums = { 2, 2, 3, 4, 4, 5, 5 };
        System.out.println(singleNonDuplicate(nums));
    }
}
