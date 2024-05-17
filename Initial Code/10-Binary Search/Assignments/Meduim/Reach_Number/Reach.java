package Assignments.Meduim.Reach_Number;

public class Reach {
    static int reachNumber(int target) {
        /*
         * Note: the sum of first k natural numbers are called triangular numbers
         * 1. Find the smallest triangular number that is greater than or equal to
         * target
         * 2. we will find the difference between sum and target to see how much steps
         * we are far away to reach target
         * ya hum kitny steps agy nikl gaye hain goal tk phoohnchy k liye
         * if difference is even then we reach at out destination
         * if difference is odd we need to keep forward one step away
         * if
         */
        target = Math.abs(target);
        int k = 0;
        int sum = 0;
        while (sum < target) {
            k++;
            sum = k * (k + 1) / 2;
        }
        System.out.println("Sum = " + sum);
        System.out.println("k = " + k);
        int diff = sum - target;
        if (diff % 2 == 0) {
            return k;
        } else if (k % 2 == 0) {
            return k + 1;
        } else {
            return k + 2;
        }
    }

    static int reachNumber2(int target) {
        /*
         * Note: the sum of first kth natural numbers is called triangular number
         * 1. we will calculate sum mean triangular number find the number that is
         * greater than or equal to target
         * 2. Then we will see the difference between sum and target
         * 3. if difference is odd we need to keep moving
         * 4. if differnce is even then we found our ans
         * Example:
         * target = 10
         * number line = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
         * at 4th step our sum will be 10 and diffrenece between target and sum is even
         * --> 10 - 10 == 0 % 2 == 0
         * 
         * for target = 7
         * number line --> 1, 2, 3, 4, 5, 6, 7
         * at step 4 our sum = 1+2+3+4 = 10
         * diff = 10 - 7 = 3 odd
         * we need to keep moving forward one step
         * sum = 1+2+3+4+5 = 15 - 7 = 8 even so we reach at our targe after 5 steps
         * 
         * if we will change sum of one step mean move backward then we will get diff
         * also a multiple of two
         * sum = 1-2+3+4+5 = 11 - 7 = 4
         * sum = -1+2+3+4+5 = 13 - 7 = 6
         * after changing direction it will also take 5th steps
         * so we will move in only right direction
         * so instead of moving backward mean in left we will keep moving in right
         * direction untill we get diff of multiple of two
         */

        target = Math.abs(target);
        int step = 0;
        int sum = 0;
        while (sum < target || (sum - target) % 2 != 0) {
            step++;
            sum = step * (step + 1) / 2;
        }
        return step;
    }

    public static void main(String[] args) {
        // System.out.println(reachNumber(-7));
        System.out.println(reachNumber(7));
        // System.out.println(reachNumber(7));
    }
}
