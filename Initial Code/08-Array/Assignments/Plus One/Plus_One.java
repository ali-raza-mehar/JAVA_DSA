import java.util.Scanner;

public class Plus_One {
    public static void main(String[] args) {
        int[] num;
        int num2;
        num = new int[3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter three digits in array one by one: ");
            num[i] = in.nextInt();
        }
        String str1 = "";
        for (int i = 0; i < 3; i++) {
            str1 = str1 + num[i];
        }
        str1 = str1.trim();
        num2 = Integer.parseInt(str1);
        num2 = num2 + 1;
        str1 = Integer.toString(num2);
        int lastIndex = str1.length() - 1;
        String[] str2;
        str2 = new String[lastIndex];
        for (int i = 0; i <= lastIndex; i++) {
            str2[i] = String.valueOf(str1.charAt(i));
        }
        for (int i = 0; i < str2.length; i++) {
            System.out.print(str2[i]);
        }
        in.close();
    }
}
