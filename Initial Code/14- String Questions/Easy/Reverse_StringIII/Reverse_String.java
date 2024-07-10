
package Easy.Reverse_StringIII;

import java.util.Arrays;

public class Reverse_String {
    static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder forReverse = new StringBuilder();
            forReverse.append(words[i]);
            forReverse.reverse();
            ans.append(forReverse);
            if (i < words.length - 1) {
                ans.append(" ");
            }

        }
        return (ans.toString());
    }

    public static void main(String[] args) {
        // String s = "Let's take LeetCode contest";
        String s = "Mr Ding";
        String ans = reverseWords(s);
        System.out.println(ans);
        String expected = "rM gniD";
        System.out.println(ans.equals(expected));
    }
}