
public class Problem {
    public static void main(String[] args) {
        int[] gas = { 1, 2, 3, 4, 5 };
        int[] cost = { 3, 4, 5, 1, 2 };

        int startingIndex = canCompleteCircuit(gas, cost);

        if (startingIndex >= 0) {
            System.out.println("Starting index: " + startingIndex);
        } else {
            System.out.println("No possible starting index.");
        }
    }

    static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int currentGas = 0;
        int startingIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i] - cost[i];
            currentGas += gas[i] - cost[i];

            if (currentGas < 0) {
                startingIndex = i + 1;
                currentGas = 0;
            }
        }

        return totalGas >= 0 ? startingIndex : -1;
    }

}
