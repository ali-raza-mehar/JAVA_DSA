package Easy.Binary_Strings;

public class Binary {
    public static void main(String[] args) {
        System.out.println(checkOnesSegment("10000011"));
    }

    static boolean checkOnesSegment(String s) {
        if (s.length() < 2 && s.charAt(0) == '1')
            return true;
        int count = 0;
        int encounter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                count++;
            else {
                // this might be the case if we encounter 1 only one time
                // so if we will divide 1 / 2 its encounter will be zero it will increment
                // encounter
                // so because of that reason we use this condition
                if (count == 1) {
                    encounter++;
                    // encounter >= 2 it mean increment encounter we face consecutive ones second
                    // times
                    // so break the loop and return false
                    if (encounter >= 2)
                        return false;
                    count = 0;
                    continue;
                } else if (count / 2 > 0) {
                    encounter++;
                    // encounter >= 2 it meencounter we face consecutive ones second times
                    // so break the loop and return false
                    if (encounter >= 2)
                        return false;
                }
                count = 0;
            }
        }

        if (count > 0)
            encounter++;
        // encounter <= 1 it meencounter we face 1 only one time
        return (encounter <= 1);
    }
}
