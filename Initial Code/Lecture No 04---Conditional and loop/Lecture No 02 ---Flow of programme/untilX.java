import java.util.Scanner;
public class untilX {
    public static void main(String[] args) {
        int num , sum = 0 , ept = 1;
        char chr;
        String value;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = input.nextInt();
        System.out.print("Enter character: ");
        value = input.next();
        chr = value.charAt(0);
        sum = sum + num;
        for(int sp = 1; sp <= ept ; sp++){
          if(chr != 'x'){
            System.out.print("Enter number: ");
            num = input.nextInt();
            System.out.print("Enter character: ");
            value = input.next();
            chr = value.charAt(0);
            sum = sum + num;
            ept++;
        }
        else {
             break;
        }

    }
        System.out.print("The sum is = " + sum);
}
}
