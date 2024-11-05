package dsa.lcd.array;

public class prob26BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int key = 3;
        int start = 0;
        int end = nums.length;
        while (start < end){
            int mid = start + ((end - start) /2);
            if(key == nums[mid]) {
                System.out.println("Found on index "+mid);
                break;
            }
            if(key > nums[mid]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }



    }
}
