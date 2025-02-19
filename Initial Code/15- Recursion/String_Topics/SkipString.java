package String_Topics;

public class SkipString {
    static String skipString(String s) {
        if (s.isEmpty()) {
            return "";
        }
        // if start with apple then
        // skip those five characters
        if (s.startsWith("apple")) {
            return skipString(s.substring(5));
        }
        return s.charAt(0) + skipString(s.substring(1));
    }

    public static void main(String[] args) {
        String s = "applecdef";
        System.out.println(skipString(s));
    }
}
