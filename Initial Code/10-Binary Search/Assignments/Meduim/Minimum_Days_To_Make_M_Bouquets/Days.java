package Assignments.Meduim.Minimum_Days_To_Make_M_Bouquets;

public class Days {

    static boolean isPossibleToMakeBoquets(int[] nums, int days, int boquetesNeed, int totalAdjacentRequired) {
        int noOfbouquets = 0;
        int count = 0;
        for (int num : nums) {
            if (num <= days) {
                count++;
            }
            // if not greater than
            // calculate how many boquetes/baskets can we make from taken adjacent elements
            // count / no of adjacent elements
            else {
                noOfbouquets += (count / totalAdjacentRequired);
                // and update count to zero
                // for new Adjacent elements
                count = 0;
            }
        }
        // remeber at last condition will not fasle also check for last count
        noOfbouquets += (count / totalAdjacentRequired);
        return (noOfbouquets >= boquetesNeed);
    }

    static int maximum(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    static int minDays(int[] bloomDay, int m, int k) {
        int start = 1;
        int end = maximum(bloomDay);
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossibleToMakeBoquets(bloomDay, mid, m, k)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (ans != -1 ? start : ans);
    }

    public static void main(String[] args) {
        int m = 6;
        int k = 1;
        // int[] nums = { 1, 10, 3, 10, 2 };
        int[] nums = { 7, 7, 7, 7, 12, 7, 7 };
        System.out.println(minDays(nums, m, k));
    }

}
