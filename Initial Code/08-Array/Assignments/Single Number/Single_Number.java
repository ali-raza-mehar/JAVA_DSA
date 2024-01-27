
public class Single_Number {
    public static void main(String[] args) {
        int[] array = { 1, 2, 1 };
        System.out.println(singleNumber(array));
    }

    static int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}