package Questions.Easy.Majority_Element;

import java.util.Arrays;

public class Majority {
    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int i = 0;
        int previousCount = 0;
        int prevoiusNum = 0;
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            previousCount++;
            prevoiusNum = nums[i];
            i++;
        }
        previousCount++;
        prevoiusNum = nums[i];
        if (i + 1 < nums.length) {
            int count = 0;
            int num = 0;
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j] == nums[j + 1]) {
                    count++;
                    num = nums[j];
                } else {
                    count++;
                    if (count > previousCount) {
                        previousCount = count;
                        prevoiusNum = num;
                    }
                    count = 0;
                }
            }
            count++;
            if (count > previousCount) {
                previousCount = count;
                prevoiusNum = num;
            }
        }
        return prevoiusNum;
    }

    public static void main(String[] args) {
        // int[] nums = { 3, 2, 3 };
        int[] nums = { 3, 3 };
        System.out.println(majorityElement(nums));
    }
}
