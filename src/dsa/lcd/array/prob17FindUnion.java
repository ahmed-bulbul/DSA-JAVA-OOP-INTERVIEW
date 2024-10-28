package dsa.lcd.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class prob17FindUnion {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 3};

        int[] arr3 = findUnion(arr1, arr2);
        for(int val : arr3){
            System.out.print(val+" ");
        }
    }

    private static int[] findUnion(int[] arr1, int[] arr2) {
        Set<Integer> unionList = new HashSet<>();
        for(int e: arr1){
            if(!unionList.contains(e)){
                unionList.add(e);
            }
        }

        for(int e: arr2){
            if(!unionList.contains(e)){
                unionList.add(e);
            }
        }

//        int[] mergeArray = new int[unionList.size()];
//        for(int i=0;i<unionList.size();i++){
//            mergeArray[i] = (int) unionList.toArray()[i];
//        }
//        return mergeArray;

        return unionList.stream().mapToInt(Integer::intValue).toArray();
    }
}
