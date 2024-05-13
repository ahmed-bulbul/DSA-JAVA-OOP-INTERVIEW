package interview;

import java.util.HashMap;

public class AnagramMinDifference {

    public static void main(String[] args) {
        String[] a = {"tea", "tea", "act"};
        String[] b = {"ate", "toe", "acts"};
        int[] result = getMinimumDifference(a, b);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] getMinimumDifference(String[] a, String[] b) {
        int n = a.length;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[i] = getDiff(a[i],b[i]);
        }
        return result;
    }

    private static int getDiff(String a, String b) {
        if(a.length() !=b.length()) return -1;
        HashMap<Character,Integer> countMap = new HashMap<>();

        for(char c : a.toCharArray()){
            countMap.put(c,countMap.getOrDefault(c,0)+1);
        }

        for(char c : b.toCharArray()){
            if(countMap.containsKey(c) && countMap.get(c) > 0){
                countMap.put(c,countMap.get(c)-1);
            }
        }
        int difference = 0;
        for(int count : countMap.values()){
            difference = difference+count;
        }
        return difference;
    }


}
