
package Strings_Methods;

public class String_Method {
    public static void main(String[] args) {
        String s1 = " Hello World ";
        // trim method will remove leading and trailing spaces
        // it will create new object of string and will return it
        s1 = s1.trim();
        System.out.println(s1);

        // length method it will tell how many characters are in string
        // and will return result in int

        int n = s1.length();
        System.out.println(n);

        // toLowerCase will convert string to lowerCase and will return result in String
        // upperCase same as it is

        s1 = s1.toLowerCase();
        s1 = s1.toUpperCase();
        System.out.println(s1);

        // SubString will work If i wanted to get substring from string from any index
        // it will return result in String
        // substring will take 2 parameters first is starting index and second is ending
        // index
        // it will not include ending index
        // if i want to get substring from 0 to 4 it will return Hello
        // I can also specify only beginIndex
        String s2 = s1.substring(0, 5);
        System.out.println(s2);

        s2 = s1.substring(6);
        System.out.println(s2);

        s1 = s1.replace("L", "O");
        System.out.println(s1);

    }
}