package Count_Sort;

import java.util.Arrays;

public class Count {

    static void sort(int[] nums) {

        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }

        //

        int[] frequencyArray = new int[max + 1];

        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            frequencyArray[element]++;
        }

        int origionalArrayIndex = 0;
        int frequencyArrayIndex = 0;
        while (frequencyArrayIndex < frequencyArray.length) {
            int element = frequencyArrayIndex;
            if (frequencyArray[element] > 0) {
                nums[origionalArrayIndex++] = element;
                frequencyArray[element]--;
            } else {
                frequencyArrayIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 1, 3, 2, 5, 2, 8 };
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
