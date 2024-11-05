package dsa.lcd.array;

public class prob23RearrangeArray {

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1, 3};
        int[] newArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[arr[i]];
        }

        for(int val : newArr){
            System.out.print(val+" ");
        }
    }
}
