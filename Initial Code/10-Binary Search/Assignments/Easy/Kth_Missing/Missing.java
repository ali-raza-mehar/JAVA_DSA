package Assignments.Easy.Kth_Missing;

public class Missing {
    static int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // mid + 1 --> the element that should be on current index
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high + 1 + k; // low + k;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 7, 8, 11 };
        System.out.println(findKthPositive(nums, 2));
    }
}
