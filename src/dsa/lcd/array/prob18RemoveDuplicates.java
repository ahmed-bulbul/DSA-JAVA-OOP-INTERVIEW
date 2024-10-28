package dsa.lcd.array;

import java.util.HashSet;
import java.util.Set;

public class prob18RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        int[] sortedArr = set.stream().mapToInt(Integer::intValue).toArray();
        for(int val : sortedArr){
            System.out.println(val);
        }

    }
}
