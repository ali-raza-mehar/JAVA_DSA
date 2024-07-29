package Medium.Split_String_To_Make_Palindrome;

public class Split {
    static boolean checkPalindromeFormation(String a, String b) {
        if (a.length() < 2 && b.length() < 2) {
            return true;
        }
        if (a.isEmpty() && b.length() >= 1) {
            return isPalindrome(b);
        } else if (b.isEmpty() && a.length() >= 1) {
            return isPalindrome(a);
        }
        StringBuilder aPrefixAndBSuffix = new StringBuilder();
        StringBuilder aSuffixAndBprefix = new StringBuilder();
        StringBuilder reverse1 = new StringBuilder();
        StringBuilder reverse2 = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < a.length() && j < b.length()) {
            // 1st prefix of a
            aPrefixAndBSuffix.append(a, 0, i + 1);
            // sufix of b
            if (j + 1 < b.length())
                aPrefixAndBSuffix.append(b, j + 1, b.length());
            // else
            // return false;
            reverse1.append(aPrefixAndBSuffix);
            reverse1.reverse();
            if (aPrefixAndBSuffix.toString().equals(reverse1.toString()))
                return true;
            aPrefixAndBSuffix.setLength(0);
            reverse1.setLength(0);

            // suffix of a
            if (i + 1 < a.length()) {
                aSuffixAndBprefix.append(a, i + 1, a.length());
            }
            // else
            // return false;

            // prefix of b
            aSuffixAndBprefix.append(b, 0, j + 1);
            reverse2.append(aSuffixAndBprefix);
            reverse2.reverse();
            if (aSuffixAndBprefix.toString().equals(reverse2.toString()))
                return true;
            aSuffixAndBprefix.setLength(0);
            reverse2.setLength(0);

            i++;
            j++;
        }
        return false;
    }

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

    public static void main(String[] args) {
        String a = "abdef";
        String b = "fecab";
        System.out.println(checkPalindromeFormation(a, b));
    }
}
