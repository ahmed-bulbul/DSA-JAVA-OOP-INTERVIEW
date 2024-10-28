package dsa.lcd.array;

import java.util.Arrays;

public class prob21FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 7, 8};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int missingNumber = Integer.MIN_VALUE;


        for(int i=0;i<arr.length;i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }

        int expectedSum = 0;
        for (int i = min; i <= max; i++) {
            expectedSum += i;
        }

        int actualSum = 0;

        for(int e: arr){
            actualSum+=e;
        }

        System.out.println(expectedSum - actualSum);

    }
}
