package leetcode.pattern.prefixsum;

public class PrefixSumExample {
    public static void main(String[] args) {
        // Rainfall data for a week (mm per day)
        int[] rainfall = {10, 20, 15, 25, 30, 10, 5};

        // Step 1: Compute the prefix sum array
        int[] prefixSum = computePrefixSum(rainfall);

        // Queries
        System.out.println("Rainfall from Day 2 to Day 5: " + rangeSum(prefixSum, 2, 5)); // Output: 90
        System.out.println("Rainfall from Day 1 to Day 7: " + rangeSum(prefixSum, 1, 7)); // Output: 115
        System.out.println("Rainfall from Day 3 to Day 4: " + rangeSum(prefixSum, 3, 4)); // Output: 40
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

    // Calculate range sum from Day start to Day end (1-indexed)
    private static int rangeSum(int[] prefixSum, int start, int end) {
        return prefixSum[end] - prefixSum[start - 1];
    }
}

