package interview.agoda.strings;

public class Palindrom {

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() -1;

        while (start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;

    }
}
