package Questions.Easy.Intersection_Of_Two_Arrays_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterSection {
    static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[] {};
        }

        List<Integer> intersection = new ArrayList<>();

        int nums1Length = nums1.length;
        int nums2Length = nums2.length;

        if (nums1Length > nums2Length) {
            Arrays.sort(nums2);
        } else {
            Arrays.sort(nums1);
        }

        if (nums1Length > nums2Length) {
            for (int i = 0; i < nums1.length; i++) {
                int num = nums1[i];
                for (int j = 0; j < nums2.length; j++) {
                    if (nums2[j] > num) {
                        break;
                    } else if (nums2[j] == num) {
                        intersection.add(num);
                        nums2[j] = nums2[j] * (-1);
                        break;
                    } else if (nums2[j] < 0) {
                        continue;
                    }
                }
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
                int num = nums2[i];
                for (int j = 0; j < nums1.length; j++) {
                    if (nums1[j] > num) {
                        break;
                    } else if (nums1[j] == num) {
                        intersection.add(num);
                        nums1[j] = nums1[j] * (-1);
                        break;
                    } else if (nums1[j] < 0) {
                        continue;
                    }
                }
            }
        }

        if (intersection.size() == 0) {
            return new int[] {};
        }

        int[] ans = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            ans[i++] = num;
        }

        return ans;
    }

    public static void main(String[] args) {
        // int[] nums2 = { 4, 9, 5, 9 };
        // int[] nums1 = { 9, 4, 9, 8, 4 };
        int[] nums2 = { 1, 2, 2, 1 };
        // int[] nums1 = { 2, 2 };
        int[] nums1 = { 3, 4 };
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    /*
     * 
     * explain what is two pointers approach time and space complexity when to use
     * it how to use it how we will identify that specific problem will use two
     * pointers approach
     */
}
