package Medium.Remove_Characters;

public class Remove {
    static int maximumRemovals(String s, String p, int[] removable) {
        // StringBuilder sb = new StringBuilder(s);
        int ans = 0;
        // the goal to check how maximum we can achieve
        int left = 0, right = removable.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isSubSequence(s, p, removable[mid])) {
                left = mid + 1;
                ans = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    static boolean isSubSequence(String s, String p, int deleteIndex) {
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(deleteIndex);
        int sbPointer = 0;
        int pPointer = 0;
        while (sbPointer < sb.length() && pPointer < p.length()) {
            if (p.charAt(pPointer) == sb.charAt(sbPointer)) {
                sbPointer++;
                pPointer++;
            } else {
                sbPointer++;
            }
        }
        return (pPointer >= p.length());
    }

    public static void main(String[] args) {
        // String s = "abcbddddd";
        String s = "abcacb";
        // String s = "abcab";
        // String s = "qobftgcueho";
        // String p = "abcd";
        // String p = "abc";
        String p = "ab";
        // String p = "obue";
        // int[] nums = { 3, 2, 1, 4, 5, 6 };
        int[] nums = { 3, 1, 0 };
        // int[] nums = { 5, 3, 0, 6, 4, 9, 10, 7, 2, 8 };
        System.out.println(maximumRemovals(s, p, nums));
    }
}
