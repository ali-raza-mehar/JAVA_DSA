// next --> only one complete word;
// nextLine --> take entire line no matter how much there are characters

import  java.util.Scanner;
public class stringInput {
    public static void main(String[] args) {
      //  int a = 10;
        // in above line 10 is called literal
        // and a is called identifier

        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any name: ");
   //     name = input.next(); // only single word;
         name = input.nextLine(); // take entire line
        System.out.print("Your name is " + name);
    }
}
