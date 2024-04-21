package Assignments.Square_Root;

public class SquareRoot {

    static int mySqrt(int x) {
        if (x == 0)
            return 0;
        if (x == 1)
            return 1;
        // int ans = Integer.MIN_VALUE;
        int sp = 1;
        int ep = x - 1;
        while (sp <= ep) {
            int mid = sp + (ep - sp) / 2;
            if ((long) mid * mid > (long) x) {
                ep = mid - 1;
            } else if (mid * mid < x) {
                sp = mid + 1;
            } else
                return mid;
        }
        return ep;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(5555)); // Output: 2
    }
}
