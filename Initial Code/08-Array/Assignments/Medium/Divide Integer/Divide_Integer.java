
public class Divide_Integer {

    static int divide(int dividend, int divisor) {
        if (dividend < 0 && divisor < 0) {
            dividend = dividend * -1;
            divisor = divisor * -1;
        }
        int ans = dividend / divisor;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
    }

}