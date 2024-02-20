import java.util.Arrays;

public class Plus_one {

    static int[] plusOne(int[] digits) {

        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] array = new int[n + 1];
            array[0] = 1;
            return array;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] array = { 9, 9, 9 };
        System.out.println(Arrays.toString(plusOne(array)));
    }
}
