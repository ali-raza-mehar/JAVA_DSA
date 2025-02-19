import java.util.ArrayList;
import java.util.List;

public class IterativeSubset {
    class Solution {
        public List<List<Integer>> subsets(int[] arr) {
            List<List<Integer>> ans = new ArrayList<>();

            // intially my ans is empty
            ans.add(new ArrayList<>());

            // for every number in the array
            for (int num : arr) {
                // run the loop for size of ans time
                int n = ans.size();
                for (int i = 0; i < n; i++) {
                    // every time there will new list
                    // get the copy of list or already ans you have
                    // add the number to the list and add it to the ans
                    List<Integer> innerList = new ArrayList<>(ans.get(i));
                    // add number to it
                    innerList.add(num);
                    // add it to the ans
                    ans.add(innerList);
                }
            }
            return ans;
        }
    }
}
