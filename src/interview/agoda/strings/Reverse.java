package interview.agoda.strings;

public class Reverse {

    public static void main(String[] args) {
        String s = "Hello world";
        int len = s.length();
        String rev = "";
        for(int i = len - 1;i>=0;i--){
            char c = s.charAt(i);
            rev = rev + c;
        }

        System.out.println(rev);
    }
}
