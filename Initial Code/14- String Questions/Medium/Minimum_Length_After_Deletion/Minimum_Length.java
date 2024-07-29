package Medium.Minimum_Length_After_Deletion;

public class Minimum_Length {
    static int minimumLength(String s) {
        if (s.length() < 2)
            return 1;
        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            System.out.println(sb.toString());
            System.out.println(sb.charAt(left) + " " + sb.charAt(right));
            System.out.println(sb.length());
            if (left + 1 < sb.length() && right - 1 >= 0) {
                if (sb.charAt(left) == sb.charAt(right) && sb.charAt(left + 1) == sb.charAt(right)
                        && sb.charAt(right - 1) == sb.charAt(left)) {
                    sb.deleteCharAt(left);
                    sb.deleteCharAt(right);
                    left = 0;
                    right = sb.length() - 1;
                } else if (sb.charAt(left) == sb.charAt(right) && sb.charAt(left + 1) == sb.charAt(right)
                        && sb.charAt(right - 1) != sb.charAt(left)) {
                    sb.deleteCharAt(left);
                    left = 0;
                    right = sb.length() - 1;
                } else if (sb.charAt(left) == sb.charAt(right) && sb.charAt(left + 1) != sb.charAt(right)
                        && sb.charAt(right - 1) == sb.charAt(left)) {
                    sb.deleteCharAt(right);
                    left = 0;
                    right = sb.length() - 1;
                } else if (sb.charAt(left) == sb.charAt(right)) {
                    sb.deleteCharAt(left);
                    sb.deleteCharAt(right);
                    left = 0;
                    right = sb.length() - 1;
                } else {
                    break;
                }
            } else
                break;
        }
        return sb.length();
    }

    public static void main(String[] args) {
        System.out.println(minimumLength("aabccabba"));
    }
}
