package Selection_Sort.Questions.Easy.Third_Largest_Element;

public class Largest {
    static int thirdMax(int[] nums) {
        // sort the array
        int n = nums.length;
        int lastIndex = n - 1;
        for (int i = 0; i < n; i++) {
            int maxIndex = getMaxIndex(nums, 0, lastIndex);
            swap(nums, maxIndex, lastIndex);
            lastIndex--;
        }

        // now find the third largest element
        int count = 1;
        int min = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[min]) {
                min = i;
                count++;
                if (count == 3)
                    return nums[min];
            }
        }
        return nums[n - 1];
    }

    static int getMaxIndex(int[] nums, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (nums[i] > nums[max])
                max = i;
        }
        return max;
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
