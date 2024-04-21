package Notes.NotesWithCode;

public class Order_Agnostic_Binary_Search {
    static int binarySearch(int[] nums, int target) {
        int sp = 0;
        int ep = nums.length - 1;
        boolean isAsc;
        if (nums[sp] < nums[ep])
            isAsc = true;
        else
            isAsc = false;
        while (sp <= ep) {
            int mid = sp + (ep - sp) / 2;

            // the common in both order that they always return mid
            if (nums[mid] == target) {
                return mid;
            }

            // now for ascending and descending order
            if (isAsc) {
                if (target > nums[mid]) {
                    sp = mid + 1;
                } else {
                    ep = mid - 1;
                }
            } else {
                if (target > nums[mid]) {
                    ep = mid - 1;
                } else {
                    sp = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] nums = { 3, 4, 5, 6, 8, 10, 11 };
        // int[] nums = { 3, 3, 5, 6, 6, 10, 11 };
        int[] nums = { 11, 7, 6, 5, 5, 3, 2, 1 };
        System.out.println(binarySearch(nums, 6));
    }
}
