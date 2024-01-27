import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArray {
    public static void main(String[] args) {
        int[] array = { 2, 7, 4 };
        int k = 181;
        int[] arr = addToArrayForm(array, k);
        System.out.println(Arrays.toString(arr));
    }

    static int[] addToArrayForm(int[] num, int k) {
        String str = "";
        for (int i = 0; i < num.length; i++) {
            str = str + num[i];
        }
        int value = Integer.parseInt(str);
        value = value + k;
        String str2 = Integer.toString(value);
        int[] arr = new int[str2.length()];
        for (int i = 0; i < str2.length(); i++) {
            int reminder = value % 10;
            arr[str2.length() - i - 1] = reminder;
            value = value / 10;
        }
        return arr;
    }
}