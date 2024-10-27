package dsa.lcd.array;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        int target = 9;
        int left = 0;
        int right = arr.length-1;
        int foundIndex = -1;

        while (left < right){
            int mid = left + (right - left)/2;
            if(target == arr[mid]){
                foundIndex = mid;
                break;
            }else if(target < arr[mid]){
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }

        System.out.println("Found on index : "+foundIndex);

    }
}
