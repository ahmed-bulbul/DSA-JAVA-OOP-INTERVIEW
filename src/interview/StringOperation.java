package interview;

import static java.lang.System.*;

public class StringOperation {

    public static void main(String[] args) {
        String s = "the sky is blue";
        out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        s = s.trim();
        String[] word = s.split(" ");

        for(int i= word.length-1;i>=0;i--){
            if(!word[i].equals("")){
                stringBuilder.append(word[i]+" ");
            }
        }

        return stringBuilder.toString().trim();


    }

}
