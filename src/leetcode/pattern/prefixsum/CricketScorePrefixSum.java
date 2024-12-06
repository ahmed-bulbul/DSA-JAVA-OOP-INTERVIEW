package leetcode.pattern.prefixsum;

public class CricketScorePrefixSum {
    public static void main(String[] args) {
        // Runs scored in each over (array index represents the over number - 1)
        int[] runsPerOver = {6, 8, 15, 10, 12, 5, 9, 4, 7, 11};

        // Step 1: Compute the prefix sum array
        int[] prefixSum = computePrefixSum(runsPerOver);

        // Queries
        System.out.println("Runs from Over 2 to Over 5: " + rangeSum(prefixSum, 2, 5)); // Output: 45
        System.out.println("Runs from Over 1 to Over 10: " + rangeSum(prefixSum, 1, 10)); // Output: 87
        System.out.println("Runs from Over 4 to Over 8: " + rangeSum(prefixSum, 4, 8)); // Output: 38

        // Additional Queries
        System.out.println("Score in the 7th Over: " + specificOverScore(runsPerOver, 7)); // Output: 9
        System.out.println("Runs in the Last 5 Overs: " + lastFiveOversScore(prefixSum, runsPerOver.length)); // Output: 36
    }

    // Compute the prefix sum array
    private static int[] computePrefixSum(int[] array) {
        int n = array.length;
        int[] prefixSum = new int[n + 1]; // Extra 0 at index 0 for convenience
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i - 1];
        }
        return prefixSum;
    }

    // Calculate range sum from Over start to Over end (1-indexed)
    private static int rangeSum(int[] prefixSum, int start, int end) {
        System.out.println(prefixSum[end] + " - " + prefixSum[start - 1]);
        return prefixSum[end] - prefixSum[start - 1];
    }

    // Get the score in a specific over (1-indexed)
    private static int specificOverScore(int[] runsPerOver, int over) {
        return runsPerOver[over - 1]; // Convert 1-indexed to 0-indexed
    }

    // Get the total runs in the last 5 overs
    private static int lastFiveOversScore(int[] prefixSum, int totalOvers) {
        int start = Math.max(totalOvers - 4, 1); // Ensure the range starts from at least Over 1
        return rangeSum(prefixSum, start, totalOvers);
    }
}