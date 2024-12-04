package leetcode.array;

public class LeftRightDifference {

    public static void main(String[] args) {
        int[] nums = {10, 4, 8, 3};
        int[] result = new LeftRightDifference().leftRightDifference(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int [] result = new int[nums.length];

        left[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1] + nums[i-1];
        }

        right[nums.length-1] = 0;
        for(int i=nums.length - 2;i>-1;i--){
            right[i] = right[i+1] + nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            result[i] = Math.abs(left[i] - right[i]);
        }




        return result;
    }
}
