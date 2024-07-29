package Easy.Reverse_Letters;

public class Reverse_Letters {
    static String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            if ((Character.isLetter(sb.charAt(left))) && (Character.isLetter(sb.charAt(right)))) {
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                left++;
                right--;
            }
            if ((!Character.isLetter(sb.charAt(right)))) {
                right--;
            }
            if ((!Character.isLetter(sb.charAt(left)))) {
                left++;
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));
    }

}
