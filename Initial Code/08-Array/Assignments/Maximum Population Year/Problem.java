
public class Problem {
    public static void main(String[] args) {
        int[][] logs = {
                { 2033, 2034 },
                { 2039, 2047 },
                { 1998, 2042 },
                { 2047, 2048 },
                { 2025, 2029 },
                { 2005, 2044 },
                { 1990, 1992 },
                { 1952, 1956 },
                { 1984, 2014 }
        };
        System.out.println(maximumPopulation(logs));
    }

    static int maximumPopulation(int[][] logs) {
        int[] array;
        int loopForarray = 0;
        int startBirthYear = logs[0][0];
        for (int i = 0; i < logs.length; i++) {
            loopForarray = loopForarray + (logs[i][1] - logs[i][0]);
            if (logs[i][0] < startBirthYear)
                startBirthYear = logs[i][0];
        }
        array = new int[loopForarray];
        for (int i = 0; i < logs.length; i++) {
            for (int j = startBirthYear; j < logs[i][1]; j++) {
                array[j - startBirthYear]++;
            }
        }
        int maxValue = 0;
        int maxYear = 0;
        for (int i = 0; i < loopForarray; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxYear = i + logs[0][0];
            }
        }
        return maxYear;
    }
}