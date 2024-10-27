package dsa.lcd.array;

public class prob15FindFrequencyOnEachElement {

    public static void main(String[] args) {
        int[] arr = {1,1,2, 2, 3, 3, 3};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }

        int[] frequency  = new int[(max - min) + 1];

        for(int i=0;i<arr.length;i++){
            frequency [arr[i] - min]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((i + min) + " occurs " + frequency[i] + " times");
            }
        }


    }
}
