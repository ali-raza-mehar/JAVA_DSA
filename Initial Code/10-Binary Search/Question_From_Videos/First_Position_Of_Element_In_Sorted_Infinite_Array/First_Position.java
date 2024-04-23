package Question_From_Videos.First_Position_Of_Element_In_Sorted_Infinite_Array;

public class First_Position {
    static int search(int[] array, int target) {
        int sp = 0;
        int ep = 1;
        while (target > array[ep]) {
            int temp = ep + 1;
            ep = ep + ((ep - sp + 1) * 2);
            sp = temp;
        }
        int ans = binarySearch(array, target, sp, ep);
        return ans;
    }

    static int binarySearch(int[] nums, int target, int sp, int ep) {
        while (sp <= ep) {
            /*
             * might be possible that (sp + ep) this thing can exceed the range of int in
             * java so --> sp + (ep - sp) / 2; is better to use in place of (sp + ep) / 2;
             */
            int mid = sp + (ep - sp) / 2;

            if (target > nums[mid]) {
                sp = mid + 1;
            } else if (target < nums[mid]) {
                ep = mid - 1;
            } // if target not greater or less than mid than it can be only equal to target
            else {
                return mid;
            }

        }
        // if target not find in the array then return -1;
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 16, 17, 18, 20, 21, 22, 34, 25, 60, 65, 68, 70, 76, 78, 80, 88,
                90, 91, 100, 110 };
        System.out.println(search(nums, 60));
    }
}
