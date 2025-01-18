package interview.agoda.strings;
public class ReverseEachWord {

    public static void main(String[] args) {
        String s = "Java is good programming languages";
        String rev = "";
        String word = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') { // Check for space to separate words
                word = word + s.charAt(i);
            } else {
                // Reverse the current word
                for (int j = word.length() - 1; j >= 0; j--) {
                    rev = rev + word.charAt(j);
                }
                rev = rev + " "; // Add space after reversing the word
                word = ""; // Reset word
            }
        }

        // Handle the last word (if there's no trailing space)
        for (int j = word.length() - 1; j >= 0; j--) {
            rev = rev + word.charAt(j);
        }

        System.out.println(rev);

        System.out.println(reverseEachWordOfString("Hello word"));
    }


    static String reverseEachWordOfString(String inputString){
        String[] words = inputString.split(" ");
        String reverseString ="";
        for(int i=0;i<words.length;i++){
            String word = words[i];
            String nstr = "";
            char ch;

            for(int j=0;j<word.length();j++){
                ch = word.charAt(j);
                nstr = ch + nstr;
            }

            reverseString = reverseString + nstr +" ";
        }

        return reverseString;
    }
}
