package String_Question;

public class SkipA {

    static String remove(String s, int i, StringBuilder sb) {
        if (i == s.length()) {
            return sb.toString();
        }
        if (s.charAt(i) != 'a' && s.charAt(i) != 'A') {
            sb.append(s.charAt(i) + "");
            return remove(s, i + 1, sb);
        } else {
            return remove(s, i + 1, sb);
        }
    }

    // by putting String in argument
    static void skip(String a, String res) {
        if (a.isEmpty()) {
            System.out.println(res);
            return;
        }
        char ch = a.charAt(0);
        if (ch != 'a' && ch != 'A') {
            skip(a.substring(1), res + ch);
        } else {
            skip(a.substring(1), res);
        }
    }

    // there is another method available

    public static void main(String[] args) {
        String s = "baccad";
        System.out.println(remove(s, 0, new StringBuilder()));
        // System.out.println(remove(s, 0));
        // skip(s, "");
    }
}
