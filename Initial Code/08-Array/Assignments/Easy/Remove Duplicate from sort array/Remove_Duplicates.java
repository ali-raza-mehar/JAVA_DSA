
public class Remove_Duplicates {
    static int removeDuplicates(int[] array) {
        /*
         * we will use two pointers approach for this problem
         * the first pointer we will suppose unique guy that will i
         * the second pointer / guy will be j and we will compare it with i
         * if second guy not equal to first guy then second guy will take place in front
         * of fisrt guy
         */
        int firstGuy = 0;
        for (int secondGuy = 1; secondGuy < array.length; secondGuy++) {
            if (array[secondGuy] != array[firstGuy]) {
                array[firstGuy + 1] = array[secondGuy];
                firstGuy++;
            }
        }

        return firstGuy + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 2 };
        int[] nums2 = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6 };
        System.out.println(removeDuplicates(nums1));
    }
}
