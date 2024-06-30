package Questions.Easy.Assign_Cookie;

import java.util.Arrays;

public class Cookie {

    static int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int childIndex = 0;
        int cookieIndex = 0;
        int contentChildren = 0;

        while (childIndex < g.length && cookieIndex < s.length) {

            if (s[cookieIndex] >= g[childIndex]) {
                contentChildren++;
                childIndex++;
            }
            cookieIndex++;
        }

        return contentChildren;
    }

    public static void main(String[] args) {
        int[] greed = { 1, 1, 1 };
        int[] size = { 1 };
        System.out.println(findContentChildren(greed, size));
    }
}
