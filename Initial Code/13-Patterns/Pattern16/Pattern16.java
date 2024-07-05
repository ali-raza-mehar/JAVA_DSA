package Pattern16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pattern16 {
    static void pattern(int n) {
        // first calculate the triangle
        List<List<Integer>> list = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            List<Integer> innerList = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    innerList.add(1);
                } else {
                    innerList.add(list.get(row - 1).get(col) + list.get(row - 1).get(col - 1));
                }
            }
            list.add(innerList);
        }

        for (int row = 0; row < list.size(); row++) {
            List<Integer> innerList = list.get(row);
            for (int space = 1; space <= n - row - 1; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < innerList.size(); col++) {
                System.out.print(innerList.get(col) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }

}
