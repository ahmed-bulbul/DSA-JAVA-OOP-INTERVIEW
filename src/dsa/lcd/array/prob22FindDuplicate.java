package dsa.lcd.array;

import java.util.HashMap;
import java.util.Map;

public class prob22FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])) {
                map.put(arr[i],1);
            }else{
                System.out.println("duplicate number is "+arr[i]);
                break;
            }

        }
    }
}
