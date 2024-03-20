import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {

    static List<Integer> spiral(int[][] mat) {
        int totalLength = mat.length;
        int arrayAtCol = mat[0].length;
        int top = 0;
        int bottom = totalLength - 1;
        int left = 0;
        int right = arrayAtCol - 1;

        List<Integer> ans = new ArrayList<>();
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                ans.add(mat[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;

            if (top <= bottom) {

                for (int i = right; i >= left; i--) {
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}