package Questions.Easy.GroupAngram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Angram {
    static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        String[] sortedArray = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            sortedArray[i] = strs[i];
        }

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            sortedArray[i] = new String(chars);
        }

        for (int i = sortedArray.length - 1; i >= 0; i--) {
            List<String> innerList = new ArrayList<>();
            innerList.add(strs[i]);
            for (int j = 0; j < i; j++) {
                if (sortedArray[i].equals(sortedArray[j])) {
                    innerList.add(strs[j]);
                }
            }
            ans.add(innerList);
        }

        return ans;
    }
}
