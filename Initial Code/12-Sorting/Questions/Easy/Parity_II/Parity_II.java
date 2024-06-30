package Questions.Easy.Parity_II;

import java.util.Arrays;

public class Parity_II {
    static int[] sortArrayByParityII(int[] nums) {
        // Arrays.sort(nums);

        int slowPointer = 0;
        while (slowPointer < nums.length - 1) {
            if ((nums[slowPointer] % 2 == 0) && (slowPointer % 2 == 0)
                    || (nums[slowPointer] % 2 != 0) && (slowPointer % 2 != 0)) {
                slowPointer++;
            } else {
                if (slowPointer % 2 == 0) {
                    int fastPointer = slowPointer + 1;
                    while (fastPointer < nums.length) {
                        if (((nums[fastPointer] % 2 == 0) && (fastPointer % 2 == 0)
                                || (nums[fastPointer] % 2 != 0) && (fastPointer % 2 != 0))) {
                            fastPointer++;
                        } else {
                            if (nums[fastPointer] % 2 == 0) {
                                int temp = nums[slowPointer];
                                nums[slowPointer] = nums[fastPointer];
                                nums[fastPointer] = temp;
                                slowPointer++;
                                break;
                            } else {
                                fastPointer++;
                            }
                        }
                    }
                } else {
                    int fastPointer = slowPointer + 1;
                    while (fastPointer < nums.length) {
                        if (((nums[fastPointer] % 2 == 0) && (fastPointer % 2 == 0)
                                || (nums[fastPointer] % 2 != 0) && (fastPointer % 2 != 0))) {
                            fastPointer++;
                        } else {
                            if (nums[fastPointer] % 2 != 0) {
                                int temp = nums[slowPointer];
                                nums[slowPointer] = nums[fastPointer];
                                nums[fastPointer] = temp;
                                slowPointer++;
                                break;
                            } else {
                                fastPointer++;
                            }
                        }
                    }
                }
            }

        }
        return nums;
    }

    static int[] sortArrayByParityII(int[] nums, int c) {
        int i = 0; // for even
        int j = 1; // for odd

        while (i < nums.length && j < nums.length) {
            if (nums[i] % 2 == 0) {
                i += 2;
            } else if (nums[j] % 2 != 0) {
                j += 2;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i += 2;
                j += 2;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        // int[] nums = { 4, 1, 1, 0, 1, 0 };
        int[] nums = { 1, 2, 3, 3, 2, 3, 0, 4 };
        // int[] nums = { 648, 831, 560, 986, 192, 424, 997, 829, 897, 843 };
        // int[] nums = { 4, 2, 5, 7 };
        // int[] nums = { 2, 5 };
        int[] result = sortArrayByParityII(nums, 0);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
