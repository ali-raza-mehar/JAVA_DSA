import java.util.Arrays;

public class Product_except_itself {

    static int[] productExceptSelf(int[] nums) {
        int prefixProduct = 1;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefixProduct;
            prefixProduct = prefixProduct * nums[i];
        }
        int postfixProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] = ans[i] * postfixProduct;
            postfixProduct = postfixProduct * nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}