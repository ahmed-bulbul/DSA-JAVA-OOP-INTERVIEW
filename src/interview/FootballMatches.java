package interview;

import java.util.*;

public class FootballMatches {
    public static List<Integer> counts(int[] teamA, int[] teamB) {
        List<Integer> result = new ArrayList<>();

        // Sort teamA array to optimize search
        Arrays.sort(teamA);

        for (int b : teamB) {
            int count = 0;
            // Count number of matches in teamA where goals are less than or equal to b
            for (int a : teamA) {
                if (a <= b) {
                    count++;
                } else {
                    break; // Since teamA is sorted, no need to continue further
                }
            }
            result.add(count);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] teamA = {1, 2, 3};
        int[] teamB = {2, 4};

        List<Integer> result = counts(teamA, teamB);
        System.out.println(result); // Output: [2, 3]
    }
}
