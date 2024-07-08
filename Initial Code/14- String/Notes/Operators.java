package Notes;

public class Operators {
    public static void main(String[] args) {
        /*
         * this will convert characters to their ASCII
         * values
         */
        // System.out.println('a' + 'b');

        /*
         * but if one of the object will string and other can be of any data type then
         * they will concatenate
         */

        // System.out.println("a" + "b");
        /*
         * this will convert 1 to Integer and then Integer will call toString method
         * that will convert 1 to string
         */
        // System.out.println("a" + 1);
        // System.out.println("a" + 12.22);

        // System.out.println("a" + new int[] { 1, 2, 3, 4, 5 });

        /*
         * one data type should be string
         */
        // System.out.println(5 + "" + new int[] { 1, 2, 3, 4 });

        System.out.println((char) ('a' + 9));

    }
}
