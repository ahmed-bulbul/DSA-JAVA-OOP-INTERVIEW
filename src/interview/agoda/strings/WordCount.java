package interview.agoda.strings;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        System.out.println(wordCount("Hello world word"));
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s == null || s.isEmpty()) {
            return;
        }
        int count = 1;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
    private static int wordCount(String helloWorld) {
        return helloWorld.split("\\s+").length;
    }
}
