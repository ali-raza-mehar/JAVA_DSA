package Easy.Valid_Palindrome_II;

public class PalindromeII {

    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        // boolean palindrome = true;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    static boolean validPalindrome(String s) {

        if (isPalindrome(s))
            return true;
        else {
            StringBuilder sb = new StringBuilder(s);
            int left = 0;
            int right = sb.length() - 1;
            while (left < right) {
                if (sb.charAt(left) != sb.charAt(right)) {
                    if ((left + 1 < sb.length()) && (sb.charAt(left + 1) == sb.charAt(right)))
                        sb.deleteCharAt(left);
                    else if ((right - 1 >= 0) && (sb.charAt(right - 1) == sb.charAt(left)))
                        sb.deleteCharAt(right);
                    // else if ((left + 1 < sb.length()) && (sb.charAt(left + 1) ==
                    // sb.charAt(left)))
                    // sb.deleteCharAt(right);
                    // else if ((right - 1 <= 0) && (sb.charAt(right - 1) == sb.charAt(right)))
                    // sb.deleteCharAt(left);
                    // else if ((right + 1 <= 0) && (sb.charAt(right - 1) == sb.charAt(left)))
                    // sb.deleteCharAt(right);

                    else
                        return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "eccer";
        // System.out.println(validPalindrome(s));
        StringBuilder sb = new StringBuilder();
        sb.append(s, 0, 3);
        // sb.setLength(0);
        // System.out.println(sb.toString());
        // sb.append(s);
        System.out.println(sb.toString());
        StringBuilder reverse = new StringBuilder(sb);
        reverse.reverse();
        System.out.println(reverse.equals(sb));
    }
}
