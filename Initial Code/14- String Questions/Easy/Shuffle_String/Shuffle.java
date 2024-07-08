
package Easy.Shuffle_String;

import java.util.Arrays;

public class Shuffle {
    static String restoreString(String s, int[] indices) {
        // StringBuilder builder = new StringBuilder(indices.length);
        char[] ans = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            char ch = s.charAt(i);
            int index = indices[i];
            ans[index] = ch;
            // builder.insert(indices[i], ch);
        }

        // return (builder.toString());
        return new String(ans);
    }

    public static void main(String[] args) {
        // System.out.println(restoreString("codeleet", new int[] { 4, 5, 6, 7, 0, 2, 1,
        // 3 }));
        System.out.println(interpret("G()()()()(al)G"));
        sortSentence("Myself2 Me1 I4 and3");
    }

    static String interpret(String command) {
        StringBuilder builder = new StringBuilder(command.length());
        for (int i = 0; i < command.length() - 1; i++) {
            if (command.charAt(i) == 'G') {
                builder.append('G');
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                builder.append('o');
                i++;
            } else if (command.charAt(i) == 'a' && command.charAt(i + 1) == 'l') {
                builder.append('a');
                builder.append('l');
                i++;
            }
        }
        if (command.charAt(command.length() - 1) == 'G') {
            builder.append('G');
        }
        return builder.toString();
    }

    static void sortSentence(String s) {
        String[] words = s.split(" ");
        int[] indices = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            char ch = words[i].charAt(words[i].length() - 1);
            indices[i] = Character.getNumericValue(ch);
        }
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(indices));
        String[] ans = new String[words.length + 1];
        for (int i = 0; i < words.length; i++) {
            ans[indices[i]] = words[i];
        }
        System.out.println(Arrays.toString(ans));
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] != null) {
                builder.append(ans[i]);
                builder.append(" ");
            }
        }
        for (int i = 0; i < builder.length(); i++) {
            if (Character.isDigit(builder.charAt(i))) {
                builder.deleteCharAt(i);
            }
        }
        System.out.println(builder);
    }
}