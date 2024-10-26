package lcd.array;

public class prob3ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int len = arr.length;
        for(int i=0;i<len/2;i++){
            int temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len - i - 1] = temp;
        }

        for(var val : arr){
            System.out.print(val +" ");
        }

    }
}
