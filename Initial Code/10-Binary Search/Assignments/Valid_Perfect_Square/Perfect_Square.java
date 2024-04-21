package Assignments.Valid_Perfect_Square;

public class Perfect_Square {
    static int perfectSquare(int x) {
        if (x == 1 || x == 0)
            return x;
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
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(perfectSquare(25)); // Output: 2
    }
}
