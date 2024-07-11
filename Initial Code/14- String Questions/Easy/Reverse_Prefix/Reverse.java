package Easy.Reverse_Prefix;

public class Reverse {
    static String reversePrefix(String word, char ch) {
        int right = word.indexOf(ch);
        System.out.println(right);
        if (right == -1)
            return word;
        StringBuilder sb = new StringBuilder(word);
        int left = 0;
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String word = "xyxzxe";
        char ch = 'z';
        System.out.println(reversePrefix(word, ch));
    }
}
