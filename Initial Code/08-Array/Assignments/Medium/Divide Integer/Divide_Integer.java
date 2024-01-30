
public class Divide_Integer {

    static int divide(int dividend, int divisor) {
        int ans = dividend / divisor;
        if (dividend < 0 && divisor < 0) {
            ans = ans * -1;
            return ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(divide(-1, -1));
    }

}