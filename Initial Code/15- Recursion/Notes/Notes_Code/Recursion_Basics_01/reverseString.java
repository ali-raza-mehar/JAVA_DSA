package Notes.Notes_Code.Recursion_Basics_01;

import java.util.Arrays;

public class reverseString {
    static int sp;
    static int ep;
    static boolean isIntiallized = false;

    static String reverse(StringBuilder s) {

        if (!isIntiallized) {
            sp = 0;
            ep = s.length() - 1;
            isIntiallized = true;
        }
        if (sp >= ep) {
            return s.toString();
        }

        char temp = s.charAt(sp);
        s.setCharAt(sp, s.charAt(ep));
        s.setCharAt(ep, temp);
        sp++;
        ep--;
        return reverse(s);

    }

    public static void main(String[] args) {
        String s = "Ali";
        StringBuilder sb = new StringBuilder(s);
        System.out.println((reverse(sb)));
    }
}
