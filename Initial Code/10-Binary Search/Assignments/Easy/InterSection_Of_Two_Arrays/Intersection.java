package Assignments.Easy.InterSection_Of_Two_Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        if (nums1.length > nums2.length) {
            for (Integer integer : nums1) {
                set.add(integer);
            }
        } else {
            for (Integer integer : nums2) {
                set.add(integer);
            }
        }

        HashSet<Integer> intersection = new HashSet<>();

        for (Integer integer : (nums1.length > nums2.length) ? nums2 : nums1) {
            if (set.contains(integer)) {
                intersection.add(integer);
            }
        }

        int[] result = new int[intersection.size()];
        int index = 0;
        for (int i : intersection) {
            result[index++] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 2, 4, 5, 6 };
        int[] nums2 = { 2, 2, 4, 7, 8, 9 };
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
