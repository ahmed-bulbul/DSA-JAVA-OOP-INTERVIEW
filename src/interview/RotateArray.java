package interview;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);

    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        swap(nums,0,nums.length-1);
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);

        System.out.println(Arrays.toString(nums));

    }

    private static void swap(int[] nums, int start, int end) {

        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
