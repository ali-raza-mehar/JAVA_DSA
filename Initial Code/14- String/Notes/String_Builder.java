package Notes;

public class String_Builder {

    public static void main(String[] args) {
        /*
         * every time / during each iteration when new character will add to series
         * there will create new object in heap in pool
         * so this will take more space
         * i.e:
         * a, ab, abc, abcd, abcde, abcdef, ......... , abcdefghijkl....z;
         * every time new object is created
         */
        // String series = "";
        // for (int i = 0; i < 26; i++) {
        // char ch = (char) ('a' + i);
        // series += ch;
        // }
        // System.out.println(series);

        /*
         * to overcome the upper problem now there will come [String Buffer] for there
         * will no object create at each iteration
         * String buffer will update the existing object and will add new char to it
         * only once time object will create
         */

        // StringBuffer buffer = new StringBuffer();
        // for (int i = 0; i < 26; i++) {
        // char ch = (char) ('a' + i);
        // buffer.append(ch);
        // }
        // System.out.println(buffer);
        // System.out.println(buffer.charAt(0));
        // System.out.println(buffer.codePointAt(0)); // give ascii value
        // System.out.println(buffer.codePointCount(0, 3));
        // System.out.println(buffer.equals('a'));
        // String ans = buffer.toString();
        // System.out.println(ans.charAt(0));
        // System.out.println("[.]");
        // buffer.append("[.]");
        // buffer.insert(0, '@');
        // System.out.println(buffer);

        // StringBuilder build = new StringBuilder("This8 is2 a3 sentence4");
        // for (int i = 0; i < build.length(); i++) {
        // if (Character.isDigit(build.charAt(i))) {
        // build.deleteCharAt(i);
        // }
        // }
        // System.out.println(build);

        // StringBuilder builder = new StringBuilder();
        // builder.append('1' + "" + '0');
        // System.out.println(builder);

        System.out.println(freqAlphabets("10#11#12"));
    }

    static String freqAlphabets(String s) {
        System.out.println(s.length());
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && i + 2 < s.length()) {
                if ((Character.isDigit(s.charAt(i))) && (Character.isDigit(i + 1) || (s.charAt(i + 1) == '0'))
                        && (s.charAt(i + 2) == '#')) {
                    StringBuilder builder = new StringBuilder();
                    builder.append(s.charAt(i) + "" + s.charAt(i + 1));
                    String digit = builder.toString();
                    int value = Integer.parseInt(digit);
                    ans.append((char) ('a' + (value - 1)));
                    i += 2;
                } else {
                    int value = Character.getNumericValue(s.charAt(i));
                    // System.out.println(value);
                    ans.append((char) ('a' + (value - 1)));
                }
            }
        }

        return ans.toString();
    }
}
