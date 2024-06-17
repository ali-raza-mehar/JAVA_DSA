package Assignments.Hard.Allocates_Book_Allocation;

import java.util.Arrays;

public class Books {
    static int minPages(int[] nums, int m) {
        int start = Arrays.stream(nums).max().getAsInt();
        int end = Arrays.stream(nums).sum();
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int student = calculateStudents(nums, mid);
            if (student <= m) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return start;
    }

    static int calculateStudents(int[] nums, int pagesAllow) {
        int student = 0;
        int pagesAllocate = 0;
        for (int i = 0; i < nums.length; i++) {
            if (pagesAllocate + nums[i] <= pagesAllow) {
                pagesAllocate += nums[i];
            } else {
                student++;
                pagesAllocate = nums[i];
            }
        }
        return ++student;
    }

    public static void main(String[] args) {
        System.out.println(minPages(new int[] { 25, 46, 28, 49, 24 }, 4));
    }
}
