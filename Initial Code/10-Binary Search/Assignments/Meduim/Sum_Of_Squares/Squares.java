package Assignments.Meduim.Sum_Of_Squares;

public class Squares {
    static boolean judgeSquareSum(int c) {
        if (c == 1 || c == 0)
            return true;
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right) {
            if (((long) (left) * (long) (left)) + ((long) (right) * (long) (right)) == c)
                return true;
            else if (((long) (left) * (long) (left)) + ((long) (right) * (long) (right)) < c)
                left++;
            else
                right--;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(2147482647));
    }
}
