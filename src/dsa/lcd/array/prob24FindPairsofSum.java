package dsa.lcd.array;

import books.defaultMethod.A;

import java.util.ArrayList;
import java.util.List;

public class prob24FindPairsofSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1};
        int x = 6;
        List<Integer> resultList = new ArrayList<>();

        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i] + arr[j] == x){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }


    }
}
