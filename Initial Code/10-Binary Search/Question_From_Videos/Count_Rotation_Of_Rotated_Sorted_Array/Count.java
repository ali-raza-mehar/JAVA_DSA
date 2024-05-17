package Question_From_Videos.Count_Rotation_Of_Rotated_Sorted_Array;

public class Count {
    static int countRotation(int[] nums) {
        int pivot = findPivot(nums);
        return pivot + 1;
    }

    static int findPivot(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid < e && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > s && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }

            if (nums[s] >= nums[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return -1;
    }

    // for duplicates elements in array
    static int findPivotWithDuplicates(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid < e && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > s && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }

            if (nums[s] == nums[mid] && nums[mid] == nums[e]) {
                if (nums[s] > nums[s + 1]) {
                    return s;
                }
                s++;

                if (nums[e - 1] > nums[e]) {
                    return e - 1;
                }

                e--;
            }
            // {3,3,3,3,3,7,1,1,1}
            else if (nums[s] < nums[mid] || nums[s] == nums[mid] && nums[mid] > nums[e]) {
                s = mid + 1;
            } else
                e = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(countRotation(nums));
    }

}
