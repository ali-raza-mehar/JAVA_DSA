public class Shadowing {
    static int x = 20;
    static int y = 80;

    public static void main(String[] args) {
        int x = 40;
        System.out.println(x);
        /*
         * firstly lower level will access if lower level does not exist then higher
         * level will access.
         */
        System.out.println(y);
        /*
         * it is not error beacuse lower is not defined till this statement.yaani is
         * statment k bd lower wala howa hai define to yhaan pai lower wala hai hi nhi
         * compiler higher ko dikha dai ga
         */
        int y;
        // System.out.println(y); it is error because lower level is not initialize
        /*
         * firstly lower level then higher level
         */
    }
}
