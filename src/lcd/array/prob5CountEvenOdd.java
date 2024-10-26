package lcd.array;

public class prob5CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int totalEven = 0;
        int totalOdd = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0) totalEven++;
            else totalOdd++;
        }
        System.out.println(totalEven +"-"+ totalOdd);


    }
}
