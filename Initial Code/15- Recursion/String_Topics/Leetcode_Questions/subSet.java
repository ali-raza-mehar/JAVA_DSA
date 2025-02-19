package String_Topics.Leetcode_Questions;

import java.util.ArrayList;
import java.util.List;

public class subSet {
    public static void main(String[] args) {
        System.out.println(subsets(new int[] { 1, 2, 3 }));
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<Integer> p = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        return helper(nums, p, i, ans);
    }

    static List<List<Integer>> helper(int[] up, List<Integer> p, int i, List<List<Integer>> ans) {
        if (i >= up.length) {
            ans.add(new ArrayList<>(p));
            return ans;
        }

        // Take the element
        p.add(up[i]);
        helper(up, p, i + 1, ans);
        p.remove(p.size() - 1);
        // Not take the element
        helper(up, p, i + 1, ans);

        return ans;
    }
}
