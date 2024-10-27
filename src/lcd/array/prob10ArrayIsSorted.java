package lcd.array;

public class prob10ArrayIsSorted {

    public static void main(String[] args) {
        boolean isSorted = true;
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1] < arr[i]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);

    }
}
