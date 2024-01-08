/*

scope --> where we can access the variables is called scope or range.
a variable decalred within block are only accessible in the block in which you are declared them.
they are called function scope.
formal arguments --> the arguments which are used in function declaration are function scope.

anything define and initialize (int a = 20) outside the block cannot be initialize(int a = 10) inside the block again.
but anything intialize(int b = 20) inside the block can be initliaze outside the block(int b = 30).

block scope which can be accessed only in block:
1.)public static void main(String[] args){
             int a = 20;
              {
                int b = 20;
                a = 20; // not error
                b-->b can be accessed only in this block
             }
             System.out.println(b) --> error;
}
2.)public static void main(String[] args){
             int a = 20;
              {
                int b = 20;
                a = 20; // not error
                b-->b can be accessed only in this block
             }
             System.out.println(b) --> error;
             for(int i = 1; i <= 4; i++){
                System.out.println(i) // not error
                // for loop new variable are also block scope
             }
              System.out.println(i) // error
}
3.)public static void main(String[] args){
             int a = 20;
              {
                int b = 20;
                a = 20; // not error
                b-->b can be accessed only in this block
             }
             System.out.println(b) --> error;
             for(int i = 1; i <= 4; i++){
                System.out.println(i) // not error
                // for loop new variable are also block scope
             }
              System.out.println(i) // error
              System.out.println(num1 + num2) // error
}
static void sum(int num1 , int num2){
    System.out.println(num1 + num2); // not error
}


*/
public class scope {
    public static void main(String[] args) {
        int x = 20;
        System.out.println(x);
        {
            int b = 100;
            // int x = 30; error
            System.out.println(b);
        }
        // System.out.println(b); error
        fun(x, x);
        // System.out.println(num1 + " " + num2); error

        for (int i = 0; i < 4; i++) {
            System.out.println(i + "  ");
        }
        // System.out.println(i); // error;
    }

    static void fun(int num1, int num2) {
        num1 = 30;
        num2 = 40;
        num2++;
        System.out.println(num1 + " " + num2);
    }
}
