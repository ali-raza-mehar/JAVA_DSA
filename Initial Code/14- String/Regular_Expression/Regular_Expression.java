package Regular_Expression;

public class Regular_Expression {
    public static void main(String[] args) {
        String str = "d";

        // 1.) . --> dot mean any charcter from keyboard but should be single
        System.out.println(str.matches("."));

        // 2.) [abc] --> it means either a either b eihther c but it should be single
        // not all
        System.out.println(str.matches("[abc]"));

        // 3.) [abc][vz] --> first character should be among abc and second should be
        // either v either z

        String s1 = "az";
        System.out.println(s1.matches("[abc][vz]"));

        // 4.) [^abc] --> character other than abc
        System.out.println(str.matches("[^abc]"));

        // 5.) [a-z0-9] --> either from a-z or 0-9
        String s2 = "a2A";
        System.out.println(s2.matches("[a-z][0-9][A-Z]"));

        // 6.) [a|b|a-z] --> either a or b
        System.out.println(str.matches("[a|b|a-z]"));

        // 7.) "abc" --> exactly abc
        System.out.println(str.matches("abc"));

        // \\w --> any alphabet either upperCase or lowerCase or digit
        String s3 = "%";
        System.out.println(s3.matches("\\w"));

        // \\W --> other than any alphabet or digit
        System.out.println(s3.matches("\\W"));

        // \\s --> space
        // \\S --> anything without space or not space
        // \\d --> digit
        // \\D --> not digit

        // * --> 0 or more time
        // .* --> any letters 0 or more times
        // [abc]* --> letters between abc they can be anny number of time

    }
}
