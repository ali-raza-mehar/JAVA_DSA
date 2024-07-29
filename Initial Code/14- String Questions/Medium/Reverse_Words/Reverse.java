package Medium.Reverse_Words;

import java.util.Arrays;

public class Reverse {
    static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        // System.out.println(Arrays.toString(words));
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        // System.out.println(sb.toString());
        // System.out.println(sb.charAt(sb.length() - 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        // String s = "the sky is blue";
        String s = "a good   example";
        System.out.println(s.matches("[good]"));
        System.out.println(s);
        System.out.println(reverseWords(s));
        // System.out.println(reverseWords(s));
    }
}
