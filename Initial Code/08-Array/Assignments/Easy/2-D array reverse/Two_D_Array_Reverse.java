
import java.util.Arrays;

public class Two_D_Array_Reverse {

    public static void main(String[] args) {
        int[][] array = {
                { 1, 1, 0, 0 },
                { 1, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 0, 1, 0 },
        };
        // int ep;
        // int temp;
        // int index;
        // for (int row = 0; row < array.length; row++) {
        // ep = (array[row].length / 2);
        // index = 0;
        // for (int col = array[row].length - 1; col >= ep; col--) {
        // temp = array[row][index];
        // array[row][index] = array[row][col];
        // array[row][col] = temp;
        // index++;
        // }
        // }
        // for (int i = 0; i < array.length; i++) {
        // System.out.println(Arrays.toString(array[i]));
        // }
        // System.out.println();
        // for (int i = 0; i < array.length; i++) {
        // for (int j = 0; j < array[i].length; j++) {
        // if (array[i][j] == 0)
        // array[i][j] = 1;
        // else if (array[i][j] == 1)
        // array[i][j] = 0;
        // }
        // }
        int[][] array1 = flippImage(array);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.toString(array1[i]));
        }
    }

    static int[][] flippImage(int[][] image) {
        int ep;
        int temp;
        int index;
        for (int row = 0; row < image.length; row++) {
            ep = (image[row].length / 2);
            index = 0;
            for (int col = image[row].length - 1; col >= ep; col--) {
                temp = image[row][index];
                image[row][index] = image[row][col];
                image[row][col] = temp;
                index++;
            }
        }
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
        System.out.println();
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0)
                    image[i][j] = 1;
                else if (image[i][j] == 1)
                    image[i][j] = 0;
            }
        }
        return image;
    }
}