public class sorted {
    static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1)
            return true;

        if (arr[i] <= arr[i + 1])
            return isSorted(arr, i + 1);
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 6, 6, 8, 90 };
        System.out.println(isSorted(arr, 0));
    }

}
