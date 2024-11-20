package leetcode.stack;

import java.util.*;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {

        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        boolean[] visited = new boolean[26];

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            freq[c - 'a']--;

            if (visited[c - 'a']) {
                continue;
            }

            while (!stack.isEmpty() && stack.peek() > c && freq[stack.peek() - 'a'] > 0) {
                visited[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            visited[c - 'a'] = true;
        }

        // Build the result from the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        RemoveDuplicateLetters solver = new RemoveDuplicateLetters();
        String input = "bcdacbd";
        System.out.println("Result: " + solver.removeDuplicateLetters(input)); // Output: "abc"
    }
}
