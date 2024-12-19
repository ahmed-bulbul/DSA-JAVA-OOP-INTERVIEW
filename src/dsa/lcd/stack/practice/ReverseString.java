package dsa.lcd.stack.practice;

import dsa.lcd.stack.Stack;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello World!!";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        if(str==null) return "";
        Stack stack = new Stack(str.length());
        for (Character s : str.toCharArray()){
            stack.push(s);
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()){
           int pop =  stack.pop();
           result.append((char) pop);
        }

        return result.toString();
    }
}
