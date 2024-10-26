package outlier;

public class Solution {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            // Try to expand around a single character (odd length palindrome)
            int len1 = expandAroundCenter(s, i, i);
            // Try to expand around two characters (even length palindrome)
            int len2 = expandAroundCenter(s, i, i + 1);
            // Get the maximum length from the two expansions
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    // Helper method to expand around the center and return the length of the palindrome
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        Solution p = new Solution();
        System.out.println(p.longestPalindrome("babad")); // Output: "bab" or "aba"
        System.out.println(p.longestPalindrome("cbbd"));  // Output: "bb"
        System.out.println(p.longestPalindrome(""));      // Output: ""
    }
}