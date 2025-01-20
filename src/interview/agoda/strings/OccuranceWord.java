package interview.agoda.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccuranceWord {

    public static void main(String[] args) {
        String s = "Hello world Hello world";
        int count = 1;
        String word ="";
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){

            if(!(s.charAt(i) ==' ')){
                word = word + s.charAt(i);

            }else{
                if(map.containsKey(word)){
                    map.put(word,map.get(word)+1);
                }else{
                    map.put(word,1);
                }

                word="";
            }
        }

        // handle the last word
        if(map.containsKey(word)){
            map.put(word,map.get(word)+1);
        }else{
            map.put(word,1);
        }

        Set<String> words = map.keySet();

        for(String w : words){
            System.out.println(w+" :" +map.get(w));
        }




        System.out.println(count);

    }
}
