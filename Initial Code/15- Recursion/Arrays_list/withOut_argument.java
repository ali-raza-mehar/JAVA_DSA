package Arrays_list;

import java.util.ArrayList;

public class withOut_argument {
    static ArrayList<Integer> search(int[] arr, int target, int i) {

        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            return list;
        }

        if (arr[i] == target)
            list.add(i);

        ArrayList<Integer> ans = search(arr, target, i + 1);
        System.out.println("ans = " + ans);
        System.out.println("list of current func = " + list);
        list.addAll(ans);
        System.out.println(i);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 4, 4 };
        ArrayList<Integer> list = ((search(arr, 4, 0)));
        System.out.println(list);
    }
}
