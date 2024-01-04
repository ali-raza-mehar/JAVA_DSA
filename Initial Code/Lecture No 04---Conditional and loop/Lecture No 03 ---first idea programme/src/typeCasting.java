import  java.util.Scanner;
public class typeCasting {
    public static void main(String[] args) {
// when other data type variable is assign to another data type variable then casting tak place
// there are two conditions for type casting
//  1) type should be compatible such that it can be converted to desired data type
//  i.e. if we gave string to float.it will not convert to float.Data type should be compatible.
//  2)  Destination type should be greater than the source type.
//  float num = int value;
//        as we know that float is greater than the int
//        the data type on left hand side should be greater tha the right hand side

//        float numOfFLoat;
//        int integerValue;
//        Scanner input = new Scanner(System.in);
//        numOfFLoat = input.nextFloat();

//        left hand side is greater than the right hand side
//        numOfFLoat = integerValue;

//        as we see that left hand side is less than right hand side.it cannot be possible.
//        we make this possible if right hand side is less than or equal to left hand side.
//        we can achieve this through casting

//        integerValue = (int) (numOfFLoat);
//        System.out.println(integerValue);

//        int num = 257;
        // byte can store numbers only up to  ---> 256 digit;
        // if assigning number is greater than its range it will give reminder by dividing the given number to its range.
//        byte a = (byte) (num ); // 257 % 256 = 1
//        byte a = (byte) (num * 2); // num * 2 = 514,   514 % 256 = 2;
//        System.out.println(a);

//        int num;
//        Scanner input = new Scanner(System.in);
//        num =(int) (input.nextFloat());
//        System.out.println(num);

//        bigger (mathOperations) smaller = bigger;
//        float + int = float
//        float * int = float
//        float .. int = float
//        short + int = int
//        short - int = int
//        long / int = long
//        float + int - long * double = double

        char c = 'a';
        byte b = (byte) 20;
        int i = 30;
        short s = 40;
        long l = 100L;
        float f = 12.323f;
        double d = 3213.213;
        float result1 = (i * f);
        long result2 = (long) (i * l * f);
        int result3 = i * s;
        double result4 = s + i - f + (l / b) * b + d;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);


    }
}
