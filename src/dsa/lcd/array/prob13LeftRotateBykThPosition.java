package dsa.lcd.array;

public class prob13LeftRotateBykThPosition {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 1;
        int n = arr.length;
        k = k % n;

        reverse(arr,0,n-1);
        reverse(arr,k,k-1);
        reverse(arr,k,n-1);

        for(var v : arr){
            System.out.print(v+" ");
        }

    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
