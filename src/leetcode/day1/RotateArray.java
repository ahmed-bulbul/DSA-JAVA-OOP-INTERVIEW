package leetcode.day1;

import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Long l = sc.nextLong();
        long r = sc.nextLong();
        System.out.println("YES");
        for(long i=l;i<r;i+=2){
            System.out.println(Long.toString(i)+" "+Long.toString(i+1));
        }

        RotateArray rotateArray = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7};

        for(int i=0;i<nums.length/2;i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }

      //  rotateArray.rotate(nums,3);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }

    public void rotate(int[] nums, int k) {

        k %= nums.length;
        swap(nums,0,nums.length-1);
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);

    }

    public void swap(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
