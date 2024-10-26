package dsa.stack;


import java.util.*;

public class PriorityQueueT {

    public static void main(String[] args) {
        System.out.println(isAnagram("a", "ab"));
    }

    public static boolean isAnagram(String s, String t) {

        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(!sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),1);
            }else{
                sMap.put(s.charAt(i),sMap.get(s.charAt(i)) + 1);
            }
        }

        for(int i=0;i<t.length();i++){
            if(!tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i),1);
            }else{
                tMap.put(t.charAt(i),tMap.get(t.charAt(i)) + 1);
            }
        }

        String it = "";
        if(s.length() > t.length()){
            it = s;
        }else{
            it=t;
        }

        for(int i=0;i<it.length();i++){
            char c = it.charAt(i);
            if(!Objects.equals(sMap.get(c), tMap.get(c))){
                return false;
            }
        }


        return true;



    }

    public boolean hasDuplicate(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                return true;
            }
        }
        return false;

    }
}

