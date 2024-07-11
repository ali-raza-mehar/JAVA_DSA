package Easy.Valid_Palindrome;

public class ValidPalindrome {
    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || Character.isDigit(s.charAt(i)))
                ans.append(s.charAt(i));
        }
        int left = 0;
        int right = ans.length() - 1;
        while (left < right) {
            if (ans.charAt(left) != ans.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("1b1"));
    }
}
