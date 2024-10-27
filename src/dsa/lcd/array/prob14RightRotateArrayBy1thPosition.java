package dsa.lcd.array;

public class prob14RightRotateArrayBy1thPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int len =arr.length;
        int temp = arr[len-1];
        for(int i=len-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        for(var c : arr){
            System.out.print(c+" ");
        }

    }

}
