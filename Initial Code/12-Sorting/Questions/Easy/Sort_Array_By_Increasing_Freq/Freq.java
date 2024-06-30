package Questions.Easy.Sort_Array_By_Increasing_Freq;

public class Freq {
    static int[] frequencySort(int[] nums) {

        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int[] freqArr = new int[max + 1];

        for (int num : nums) {
            freqArr[num]++;
        }

        int index = 0;
        for (int i = 0; i < freqArr.length; i++) {
            int min = findMin(freqArr);

            while (freqArr[min] > 0) {
                nums[index] = min;
                freqArr[min]--;
                index++;
            }
        }

        return nums;

    }

    static int findMin(int[] freqArr) {
        int min = 0;
        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] > 0) {
                min = i;
                break;
            }
        }

        for (int i = 0; i < freqArr.length; i++) {
            int element = i;
            if (freqArr[element] > 0) {
                if (freqArr[element] < freqArr[min]) {
                    min = element;
                } else if (freqArr[element] == freqArr[min]) {
                    if (element > min) {
                        min = element;
                    }
                }
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 2, 3 };
        // int[] nums = { 2, 3, 1, 3, 2 };
        int[] result = frequencySort(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
