package interview.summaries;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringSummaries {

    public static void main(String[] args) {
        String[] s = {"hello"};
        System.out.println(reverseString("madam"));

        String input1 = "listen";
        String input2 = "silent";
        System.out.println(areAnagrams(input1, input2));

        String input = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(input));

        String sentence = "Given a string sentence, consisting of words separated by spaces, return the longest word with an even length";
        System.out.println(longestEvenWord(sentence));

    }

    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        if(s.contentEquals(sb)) System.out.println("Palindrome....");

        return sb.toString();
    }

    public static boolean areAnagrams(String s1, String s2) {

        if(s1.length() !=s2.length()) return false;
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars= s2.toCharArray();

        Arrays.sort(s1Chars);
        Arrays.sort(s2Chars);
        return Arrays.equals(s1Chars, s2Chars);

    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }

    public static String longestEvenWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestEven = "";

        for(String word : words){
            if(word.length() %2 == 0 && word.length() > longestEven.length()){
                longestEven = word;
            }
        }
        return longestEven;
    }
}
