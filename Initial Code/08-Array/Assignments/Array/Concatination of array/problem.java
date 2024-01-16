import java.util.Arrays;

public class problem {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = { 1, 2, 3 };
        int newArrayLength = arr.length * 2;
        int[] newArray = new int[newArrayLength];
        if (arr.length == 0)
            System.out.print("Empty array");
        else if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
                count++;
            }
            if (count == arr.length) {
                int newArrayIndex = arr.length;
                for (int i = 0; i < arr.length; i++) {
                    newArray[newArrayIndex] = arr[i];
                    newArrayIndex++;
                }
            }
            System.out.println(Arrays.toString(newArray));
        }
    }
}
