package Question_From_Videos.First_And_Last_Position;

import java.lang.reflect.Array;
import java.util.Arrays;

public class First_And_Last {
    static int[] positions(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int sp = 0;
        int ep = nums.length - 1;
        int count = 1;
        int initialMid = 0;
        while (sp <= ep) {
            int mid = sp + (ep - sp) / 2;

            if (nums[mid] != target) {
                if (target > nums[mid]) {
                    sp = mid + 1;
                } else if (target < nums[mid]) {
                    ep = mid - 1;
                }
            } else if (nums[mid] == target) {
                if (nums[mid - 1] != target && nums[mid + 1] != target) {
                    // it means element appear only once
                    ans[0] = mid;
                    ans[1] = mid;
                    return ans;
                } else if (nums[mid - 1] == target && nums[mid + 1] != target) {
                    ans[1] = mid - 1;
                    ep = mid - 1;
                } else if (nums[mid - 1] != target && nums[mid + 1] == target) {
                    ans[0] = mid;
                    sp = mid + 1;
                } else if (nums[mid + 1] == target && nums[mid - 1] == target) {
                    initialMid = mid;
                    count = 1;
                    ep = mid - 1;
                }
            }
        }
        if (count == 1) {
            sp = initialMid + 1;
            ep = nums.length - 1;
            while (sp <= ep) {
                int mid = sp + (ep - sp) / 2;

                if (nums[mid + 1] == target) {
                    sp = mid + 1;
                } else if (nums[mid + 1] != target) {
                    ans[1] = mid;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 6, 6, 6, 7, 8, 8, 9, 10 };
        int[] ans = positions(nums, 6);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
