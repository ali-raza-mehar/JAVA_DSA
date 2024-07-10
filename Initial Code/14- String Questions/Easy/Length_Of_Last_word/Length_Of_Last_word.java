package Easy.Length_Of_Last_word;

import java.util.Arrays;

public class Length_Of_Last_word {

    static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i] != ",") {
                StringBuilder builder = new StringBuilder();
                builder.append(words[i]);
                return builder.length();
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
