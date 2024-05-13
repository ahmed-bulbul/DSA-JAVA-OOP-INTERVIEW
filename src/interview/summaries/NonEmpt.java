package interview.summaries;

import java.util.HashMap;
import java.util.HashSet;

public class NonEmpt {

    public static void main(String[] args) {
        String s = "aaabb"; //output : abc
        System.out.println(lastNonEmptyString(s));
    }


    public static String lastNonEmptyString(String s) {

        HashMap<Character,Integer> hm = new HashMap<>();
        int max = 0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
            max  = Math.max(max,hm.get(c));
        }

        StringBuilder sb = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();

        for(int i=s.length()-1;i>=0;i--){
            char a = s.charAt(i);
            if(max==hm.get(a) && !hs.contains(a)){
                sb.append(a);
                hs.add(a);
            }
        }

        return sb.reverse().toString();
    }

}
