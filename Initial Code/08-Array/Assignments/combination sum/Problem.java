
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the candidates to handle duplicates

        generateCombinations(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    private void generateCombinations(int[] candidates, int remainingTarget, int start,
            List<Integer> currentCombination, List<List<Integer>> result) {
        if (remainingTarget == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            int currentCandidate = candidates[i];

            // Skip duplicates to avoid duplicate combinations
            if (i > start && currentCandidate == candidates[i - 1]) {
                continue;
            }

            if (currentCandidate > remainingTarget) {
                break; // No need to check further if the candidate is greater than remaining target
            }

            currentCombination.add(currentCandidate);
            generateCombinations(candidates, remainingTarget - currentCandidate, i, currentCombination, result);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    public static void main(String[] args) {
        Problem solution = new Problem();

        // Example 1
        int[] candidates1 = { 2, 3, 6, 7 };
        int target1 = 7;
        List<List<Integer>> result1 = solution.combinationSum(candidates1, target1);
        System.out.println("Example 1: " + result1);

        // Example 2
        int[] candidates2 = { 2, 3, 5 };
        int target2 = 8;
        List<List<Integer>> result2 = solution.combinationSum(candidates2, target2);
        System.out.println("Example 2: " + result2);

        // Example 3
        int[] candidates3 = { 2 };
        int target3 = 1;
        List<List<Integer>> result3 = solution.combinationSum(candidates3, target3);
        System.out.println("Example 3: " + result3);
    }
}
