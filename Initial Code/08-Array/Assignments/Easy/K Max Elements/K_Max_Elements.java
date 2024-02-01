
public class K_Max_Elements {

    static void maxK(int[] array, int k) {
        int max;
        int max2 = 0;
        int j;
        String correspondingIndex = "";
        for (int i = 0; i < k; i++) {
            max = array[i];
            for (j = i + 1; j < array.length; j++) {
                correspondingIndex = correspondingIndex + array[j];
            }
            if (!correspondingIndex.equals(j)) {

            }
            // max2 = max;
            System.out.print(max2 + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        maxK(nums, 3);
    }

}