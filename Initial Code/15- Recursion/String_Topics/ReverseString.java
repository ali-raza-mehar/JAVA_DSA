package String_Topics;

public class ReverseString {
    static String reverse(String s) {
        if (s.isEmpty()) {
            return "";
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    static void reverse2(String s, String res) {
        if (s.isEmpty()) {
            System.out.println(res);
            return;
        }
        reverse2(s.substring(0, s.length() - 1), res + s.charAt(s.length() - 1));
    }

    public static void main(String[] args) {
        // System.out.println(reverse("1234"));
        reverse2("1234", "");
    }
}
