package Arrays_list;

import java.util.ArrayList;

public class argument_list {

    static ArrayList<Integer> search(int[] arr, int target, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }

        if (arr[i] == target) {
            list.add(i);
            return search(arr, target, i + 1, list);
        }
        return search(arr, target, i + 1, list);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 4 };
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(search(arr, 4, 0, list));
    }

}
