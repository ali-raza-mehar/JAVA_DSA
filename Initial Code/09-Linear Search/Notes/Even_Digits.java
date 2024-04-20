package Notes;

public class Even_Digits {
    static int evenDigits(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEven(nums[i])) {
                ans++;
            }
        }
        return ans;
    }

    static boolean isEven(int num) {
        int count = digits(num);
        return count % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        return (int) (Math.log10(num)) + 1;
    }

    public static void main(String[] args) {
        // int[] nums = { 12, 3, 7854, 2, 554 };
        int[] nums = { 12, 32, 785, 22, 554 };
        System.out.println(evenDigits(nums));
        System.out.println(digits2(3456));
    }
}
