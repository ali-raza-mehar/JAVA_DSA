package Easy.BackSpace;

public class Backspace {
    /**
     * Compares two strings after applying backspace rules.
     * 
     * @param s The first input string
     * @param t The second input string
     * @return true if the two strings are equal after applying backspace rules,
     *         false otherwise
     */
    static boolean backspaceCompare(String s, String t) {
        // sb1 for characters that should not be backspaced
        StringBuilder sb1 = new StringBuilder();
        sb1.append("");
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (((s.charAt(left) >= 'a' && s.charAt(left) <= 'z') && s.charAt(right) == '#')
                    || ((s.charAt(right) >= 'a' && s.charAt(right) <= 'z') && s.charAt(left) == '#')) {
                left++;
                right--;
                continue;
            } else {
                sb1.append(s.charAt(left));
                sb1.append(s.charAt(right));
            }

            left++;
            right--;
        }

        // another sb2 for the second string
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        left = 0;
        right = t.length() - 1;
        while (left < right) {
            if (((t.charAt(left) >= 'a' && t.charAt(left) <= 'z') && t.charAt(right) == '#')
                    || ((t.charAt(right) >= 'a' && t.charAt(right) <= 'z') && t.charAt(left) == '#')) {
                left++;
                right--;
                continue;
            } else {
                sb2.append(t.charAt(left));
                sb2.append(t.charAt(right));
            }

            left++;
            right--;
        }

        return (sb1.toString().equals(sb2.toString()));
    }

    public static void main(String[] args) {
        String s = "ab##";
        StringBuilder sb = new StringBuilder(s);
        sb.substring(0, 0);
        sb.setLength(0);
        String t = "c#d#";
        System.out.println(backspaceCompare(s, t));
    }

}
