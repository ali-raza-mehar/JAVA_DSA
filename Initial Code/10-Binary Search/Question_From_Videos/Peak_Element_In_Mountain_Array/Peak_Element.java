package Question_From_Videos.Peak_Element_In_Mountain_Array;

public class Peak_Element {
    static int peakIndexInMountain(int[] nums) {
        int sp = 0;
        int ep = nums.length - 1;
        while (sp < ep /* beacuse in the end sp and ep will point toward the max elemnt */) {
            int mid = sp + (ep - sp) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // this might can be the ans
                // but there is exist increasing order on the left side
                ep = mid;
            } else {
                // it might be possible that my ans can exist in the decreasing order
                sp = mid + 1;
            }
        }
        return nums[sp];
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 4, 3, 2, 1 };
        System.out.println(peakIndexInMountain(nums));
    }
}
