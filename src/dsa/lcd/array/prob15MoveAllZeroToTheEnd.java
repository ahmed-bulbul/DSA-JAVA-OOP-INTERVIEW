package dsa.lcd.array;

public class prob15MoveAllZeroToTheEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0 ){
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i=index;i<arr.length;i++){
            arr[i] = 0;
        }

        for(var val : arr){
            System.out.print(val+" ");
        }

    }
}
