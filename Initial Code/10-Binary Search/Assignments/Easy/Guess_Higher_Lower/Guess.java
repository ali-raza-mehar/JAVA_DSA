package Assignments.Easy.Guess_Higher_Lower;

public class Guess {

    public int guessNumber(int n) {
        int sp = 0;
        int ep = n;
        int ans;
        while (sp <= ep) {
            int mid = sp + (ep - sp) / 2;
            ans = guess(mid);
            if (ans == -1)
                ep = mid - 1;
            else if (ans == 1)
                sp = mid + 1;
            else if (ans == 0)
                return mid;
        }
        return -1;
    }

    static int guess(int num) {
        int target = 5;
        if (num == target) {
            return 0;
        } else if (num > target) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(guess(10));
    }
}
