package Notes;

import java.util.Arrays;

public class Linear_Search_String {
    static boolean linearSearch(String str, char target) {
        // String[] str1 = { "Ali", "Raza", "Hamza" };
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "Ali";
        System.out.println(linearSearch(str, 'i'));
        System.out.println(Arrays.toString(str.toCharArray()));
    }
}
