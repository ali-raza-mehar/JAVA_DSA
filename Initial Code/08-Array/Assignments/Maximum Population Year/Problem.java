
public class Problem {
    public static void main(String[] args) {
        int[][] logs = {
                { 1993, 1999 },
                { 2000, 2010 }
        };
        System.out.println(maximumPopulation(logs));
    }

    static int maximumPopulation(int[][] logs) {
        int[] array = new int[101];
        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++)
                array[j - 1950]++;
        }
        int maxValue = 0;
        int maxYear = 1950;
        for (int i = 0; i < 101; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }
}