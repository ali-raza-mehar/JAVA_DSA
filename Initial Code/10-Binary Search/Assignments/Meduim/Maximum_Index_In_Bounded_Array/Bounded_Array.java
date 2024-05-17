package Assignments.Meduim.Maximum_Index_In_Bounded_Array;

public class Bounded_Array {

    static long getSumByElments(long count, long value) {
        return ((long) (count * value) - (long) (count * (count + 1)) / 2);
    }

    static int maxValue(int n, int index, int maxSum) {
        long left = 1;
        long right = maxSum;
        int result = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long leftCount = Math.min(index, mid - 1);
            long leftSum = getSumByElments(leftCount, mid) + Math.max(0, leftCount);
            long rightCount = Math.min(n - index - 1, mid - 1);
            long rightSum = getSumByElments(leftCount, mid) + Math.max(0, n - index - 1 - rightCount);

            if (leftSum + rightSum + mid <= maxSum) {
                result = (int) mid;
                left = mid + 1;

                if (mid == n || mid == maxSum) {
                    break;
                }
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
