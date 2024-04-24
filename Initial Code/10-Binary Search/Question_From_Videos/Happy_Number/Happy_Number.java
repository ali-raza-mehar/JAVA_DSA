package Question_From_Videos.Happy_Number;

import java.util.HashSet;

import java.util.Set;

public class Happy_Number {
    static boolean isHappy(int n) {
        Set<Integer> usedIntegers = new HashSet<>();

        while (true) {
            // find sum of squares
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n = n / 10;
            }
            // if sum is 1, return true
            if (sum == 1) {
                return true;
            }
            // Else, new number is current sum
            n = sum;

            // check if already countered current sum, return false
            if (usedIntegers.contains(sum)) {
                return false;
            }
            // else add it to the set
            usedIntegers.add(sum);
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
