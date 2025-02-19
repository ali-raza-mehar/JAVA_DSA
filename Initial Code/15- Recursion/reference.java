public class reference {
    public static void main(String[] args) {
        String s = "ABC";
        pointing(s);
        System.out.println(reverse(s, ""));
        System.out.println(s);
    }

    static String reverse(String up, String p) {
        if (up.isEmpty()) {
            // System.out.println(p);
            return p;
        }

        return reverse(up.substring(0, up.length() - 1), p + up.substring(up.length() - 1));
    }

    static void pointing(String s) {

    }
}
