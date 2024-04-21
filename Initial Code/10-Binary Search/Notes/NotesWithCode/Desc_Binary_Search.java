package Notes.NotesWithCode;

public class Desc_Binary_Search {
    static int binarySearch(int[] nums, int target) {
        int sp = 0;
        int ep = nums.length - 1;
        while (sp <= ep) {
            /*
             * might be possible that (sp + ep) this thing can exceed the range of int in
             * java so --> sp + (ep - sp) / 2; is better to use in place of (sp + ep) / 2;
             */
            int mid = sp + (ep - sp) / 2;

            if (target > nums[mid]) {
                ep = mid - 1;
            } else if (target < nums[mid]) {
                sp = mid + 1;
            } // if target not greater or less than mid than it can be only equal to target
            else {
                return mid;
            }

        }
        // if target not find in the array then return -1;
        return -1;
    }

    public static void main(String[] args) {
        // int[] nums = { 2, 14, 15, 17, 23, 25, 30 };
        int[] nums = { 30, 25, 23, 17, 15, 14, 2 };
        System.out.println(binarySearch(nums, 30));
    }
}
