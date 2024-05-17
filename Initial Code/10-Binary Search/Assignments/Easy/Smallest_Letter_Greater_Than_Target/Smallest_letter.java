package Assignments.Easy.Smallest_Letter_Greater_Than_Target;

public class Smallest_letter {
    static char nextGreatestLetter(char[] letters, char target) {
        int sp = 0;
        int ep = letters.length - 1;
        while (sp <= ep) {
            int mid = sp + (ep - sp) / 2;

            if (target > letters[mid]) {
                sp = mid + 1;
            } else if (target < letters[mid]) {
                ep = mid - 1;
            } else {
                /*
                 * then It can be equal to middle but our goal is to find smallest letter
                 * greater than middle
                 * so update the sp after middle because we want to find element greater than
                 * middle and we know that greater element exist in right side of array
                 */
                sp = mid + 1;
            }
        }
        return letters[sp % letters.length];
    }

    public static void main(String[] args) {
        char[] nums = { 'c', 'f', 'j' };
        System.out.println(nextGreatestLetter(nums, 'z'));
    }
}
