package interview.agoda.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterInString {

    public static void main(String[] args) {
        duplicateCharacterCount("Learn Java Programming ");
    }

    private static void duplicateCharacterCount(String inputString) {
        Map<Character,Integer> map = new HashMap<>();
        char[] strArray = inputString.toCharArray();

        for(Character c : strArray){
            if(c !=' '){
                if(map.containsKey(c)){
                    map.put(c,map.get(c) + 1);
                }else{
                    map.put(c,1);
                }
            }

        }

        Set<Character> characterSet = map.keySet();

        for(Character ch  : characterSet){
            if(map.get(ch) > 1){
                System.out.println(ch+" : " +map.get(ch));
            }
        }


    }
}
