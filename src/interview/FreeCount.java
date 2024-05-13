package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FreeCount {

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
    public static String frequencySort(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.compute(c, (key, value) -> (value == null) ? 1 : value + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
        pq.addAll(frequencyMap.keySet());

        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();
            int frequency = frequencyMap.get(c);
            for (int i = 0; i < frequency; i++) {
                result.append(c);
            }
        }
        return result.toString();
    }

}
