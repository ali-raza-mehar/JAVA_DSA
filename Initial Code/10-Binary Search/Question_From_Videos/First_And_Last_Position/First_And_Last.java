package Question_From_Videos.First_And_Last_Position;

import java.util.Arrays;

public class First_And_Last {
    static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] nums, int target, boolean startPointFinding) {
        int ans = -1;
        int sp = 0;
        int ep = nums.length - 1;
        while (sp <= ep) {
            int mid = sp + (ep - sp) / 2;

            if (target > nums[mid]) {
                sp = mid + 1;
            } else if (target < nums[mid]) {
                ep = mid - 1;
            } else {
                // update the potential ans
                ans = mid;
                if (startPointFinding) {
                    ep = mid - 1;
                } else
                    sp = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 6, 6, 6, 7, 8, 8, 9, 10 };
        int[] ans = searchRange(nums, 7);
        System.out.println(Arrays.toString(ans));
    }
}