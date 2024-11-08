package Notes.Notes_Code.Recursion_Basics_01;

public class Palindrome {

    static boolean palindrome(String s, int sp, int ep) {
        if (sp <= ep) {
            {
                if (s.charAt(sp) == s.charAt(ep)) {
                    sp++;
                    ep--;
                } else {
                    return sp >= ep;
                }
            }
        } else
            return sp >= ep;
        return palindrome(s, sp, ep);
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(palindrome(s, 0, s.length() - 1));
    }

}
