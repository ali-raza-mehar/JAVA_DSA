package Notes;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        /*
         * anything you will print in println it will call the toString method
         * every time
         * Println will print string every time whatever the data type
         */
        System.out.println(56);

        // string reperesentation of object

        System.out.println(new int[] { 2, 3, 4, 5 });
        System.out.println(Arrays.toString(new int[] { 2, 3, 4, 5 }));
    }
}
