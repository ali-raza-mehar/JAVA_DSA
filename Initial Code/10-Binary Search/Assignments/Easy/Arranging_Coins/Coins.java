package Assignments.Easy.Arranging_Coins;

public class Coins {
    static int arrangeCoins(int n) {
        long s = 0, e = n;
        while (s <= e) {
            long mid = s + (e - s) / 2;

            long coins = mid * (mid + 1) / 2;

            if (coins == n)
                return (int) mid;
            else if (coins > n)
                e = mid - 1;
            else
                s = mid + 1;
        }
        return (int) e;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
}
