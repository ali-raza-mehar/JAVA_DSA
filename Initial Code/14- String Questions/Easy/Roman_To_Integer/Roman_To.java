package Easy.Roman_To_Integer;

public class Roman_To {
    static int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'M') {
                ans += 1000;
            } else if (s.charAt(i) == 'D') {
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'M') {
                        ans += (1000 - 500);
                        i++;
                    } else
                        ans += 500;
                } else
                    ans += 500;

            } else if (s.charAt(i) == 'C') {
                // c = 100
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'D') {
                        ans += (500 - 100);
                        i++;
                    } else if (s.charAt(i + 1) == 'M') {
                        ans += (1000 - 100);
                        i++;
                    } else
                        ans += 100;
                } else
                    ans += 100;
            } else if (s.charAt(i) == 'L') {
                // L = 50
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'C') {
                        ans += (100 - 50);
                        i++;
                    } else if (s.charAt(i + 1) == 'D') {
                        ans += (500 - 50);
                        i++;
                    } else if (s.charAt(i + 1) == 'M') {
                        ans += (1000 - 50);
                    } else
                        ans += 50;
                } else
                    ans += 50;
            } else if (s.charAt(i) == 'X') {
                // X == 10
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'L') {
                        ans += (50 - 10);
                        i++;
                    } else if (s.charAt(i + 1) == 'C') {
                        ans += (100 - 10);
                        i++;
                    } else if (s.charAt(i + 1) == 'D') {
                        ans += (500 - 10);
                        i++;
                    } else if (s.charAt(i + 1) == 'M') {
                        ans += (1000 - 10);
                        i++;
                    } else
                        ans += 10;
                } else
                    ans += 10;
            } else if (s.charAt(i) == 'V') {
                // V = 5
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'X') {
                        ans += (10 - 5);
                        i++;
                    } else if (s.charAt(i + 1) == 'L') {
                        ans += (50 - 5);
                        i++;
                    } else if (s.charAt(i + 1) == 'C') {
                        ans += (100 - 5);
                        i++;
                    } else if (s.charAt(i + 1) == 'D') {
                        ans += (500 - 5);
                        i++;
                    } else if (s.charAt(i + 1) == 'M') {
                        ans += (1000 - 5);
                        i++;
                    } else
                        ans += 5;
                } else
                    ans += 5;
            } else if (s.charAt(i) == 'I') {
                // V = 1
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'V') {
                        ans += (5 - 1);
                        i++;
                    } else if (s.charAt(i + 1) == 'X') {
                        ans += (10 - 1);
                        i++;
                    } else if (s.charAt(i + 1) == 'L') {
                        ans += (50 - 1);
                        i++;
                    } else if (s.charAt(i + 1) == 'C') {
                        ans += (100 - 1);
                        i++;
                    } else if (s.charAt(i + 1) == 'D') {
                        ans += (500 - 1);
                        i++;
                    } else if (s.charAt(i + 1) == 'M') {
                        ans += (1000 - 1);
                        i++;
                    } else {
                        ans += 1;
                    }
                } else
                    ans += 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        // System.out.println(romanToInt("MCMXCIV"));
        // System.out.println(romanToInt("III"));
        // System.out.println(romanToInt("IVXCLCD"));
        // System.out.println(romanToInt("CMXCIX"));
        // System.out.println(romanToInt("MMXIV"));
        System.out.println(romanToInt("MMMXLV"));
        String a = "abcdefd";
        System.out.println(a.indexOf('d'));
        StringBuilder sb = new StringBuilder(a);
        sb.insert(0, 'z');
        System.out.println(sb.toString());
    }
}
