package dsa.lcd.stack.practice;

import dsa.lcd.stack.Stack;

public class PostfixExpressionEvaluate {

    public static int evaluatePostfixExpression(String expression) {

        Stack stack = new Stack(expression.length());

        for(int i=0;i<expression.length();i++){
            char c = expression.charAt(i);

            if(Character.isDigit(c)){
                stack.push(c - '0');
            }else{
                int val1 = stack.pop();
                int val2 = stack.pop();

                if(c=='+'){
                    stack.push(val2 + val1);
                }else if(c == '-'){
                    stack.push(val2 - val1);
                }else if(c=='*'){
                    stack.push(val2 * val1);
                }
            }
        }

        return stack.pop();
    }

    public static int evaluatePostfix(String exp){
        int[] stack = new int[exp.length()];
        int top = -1;

        for(int i=0;i<exp.length();i++){
            char c = exp.charAt(i);

            if(Character.isDigit(c)){
                stack[++top] = c - '0';
            }else{
                int val1 = stack[top--];
                int val2 = stack[top--];

                if(c == '+'){
                    stack[++top] = val2 + val1;
                } else if(c == '-'){
                    stack[++top] = val2 - val1;
                }else if(c == '*'){
                    stack[++top] = val2 * val1;
                }
            }


        }


        return stack[top];


    }

    public static void main(String[] args) {
        String exp = "231*+9-";

        // Function call
        System.out.println("postfix evaluation: "
                + evaluatePostfix(exp));
    }
}
