package Easy.Unique_Character;

public class Unique {
    static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (ch != s.charAt(j))
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "aabb";
        // StringBuilder sb = new StringBuilder(s);
        // sb.setCharAt(0, 0);
        System.out.println(firstUniqChar(s));
    }
}
