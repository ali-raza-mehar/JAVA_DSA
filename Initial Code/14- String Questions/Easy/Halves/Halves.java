package Easy.Halves;

public class Halves {
    static boolean halvesAreAlike(String s) {
        // s.toLowerCase();
        // StringBuilder firstString = new StringBuilder(s.length() / 2);
        // StringBuilder secondString = new StringBuilder(s.length() / 2);
        int left = 0;
        int right = s.length() - 1;
        int firstHalfCount = 0;
        int secondHalfCount = 0;
        while (left < right) {
            if (s.charAt(left) == 'a' || s.charAt(left) == 'e' || s.charAt(left) == 'i' || s.charAt(left) == 'o'
                    || s.charAt(left) == 'u' || s.charAt(left) == 'A' || s.charAt(left) == 'E' || s.charAt(left) == 'I'
                    || s.charAt(left) == 'O' || s.charAt(left) == 'U') {
                firstHalfCount++;
            }
            if (s.charAt(right) == 'a' || s.charAt(right) == 'e' || s.charAt(right) == 'i' || s.charAt(right) == 'o'
                    || s.charAt(right) == 'u' || s.charAt(right) == 'A' || s.charAt(right) == 'E'
                    || s.charAt(right) == 'I'
                    || s.charAt(right) == 'O' || s.charAt(right) == 'U') {
                secondHalfCount++;
            }

            left++;
            right--;
        }
        return (secondHalfCount == firstHalfCount);
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("Uo"));
    }
}
