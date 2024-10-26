package leetcode.stack;

import java.util.Stack;

public class Solution {

    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!Character.isDigit(c)){
                stack.push(c);
            }else{
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Character c : stack){
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        System.out.println(Solution.clearDigits("c1bs3"));

    }
}
