package Assignments.Meduim.K_Closet_Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Closet {
    static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int count = 0;
        List<Integer> result = new ArrayList<>();
        for (int a = 0; a < arr.length - 1; a++) {
            int b = a + 1;
            if (Math.abs(arr[a] - x) < Math.abs(arr[b] - x) || Math.abs(arr[a] - x) == Math.abs(arr[b] - x)) {
                if (a == 0) {
                    result.add(arr[a]);
                    result.add(arr[b]);
                    count = count + 2;
                } else {
                    result.add(arr[b]);
                    count++;
                }
            }
            if (count == k)
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println((findClosestElements(nums, 4, 3)));
    }

}
