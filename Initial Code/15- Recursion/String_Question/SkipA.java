package String_Question;

public class SkipA {
    static StringBuilder sb = new StringBuilder();

    static String remove(String s, int i) {
        if (i == s.length()) {
            return sb.toString();
        }
        if (s.charAt(i) != 'a' && s.charAt(i) != 'A') {
            sb.append(s.charAt(i) + "");
            return remove(s, i + 1);
        } else {
            return remove(s, i + 1);
        }
    }

    // there is another method available

    public static void main(String[] args) {
        String s = "baccad";
        System.out.println(remove(s, 0));
    }
}
