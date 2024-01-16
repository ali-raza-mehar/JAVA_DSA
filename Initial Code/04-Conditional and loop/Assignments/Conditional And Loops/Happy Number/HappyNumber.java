import java.util.HashSet;

import static java.lang.System.out;

public class HappyNumber {
    public static void main(String[] args) {
        out.println(isHappy(20));  // Example usage
    }

    static boolean isHappy(int n) {
        HashSet<Integer> myset = new HashSet<>();
        int val;
        int index;

        while (true) {
             val = 0;
            while (n > 0) {
                index = n % 10;
                val += index * index;
                n /= 10;
            }

            if (val == 1)
            {
                return true;
            }
            else if (myset.contains(val))
            {
                return false;
            }
            else {
                myset.add(val);
                n = val;
            }
        }
    }
}
