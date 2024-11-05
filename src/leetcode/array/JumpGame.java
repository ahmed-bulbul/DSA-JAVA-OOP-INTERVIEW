package leetcode.array;

public class JumpGame {

    public static void main(String[] args) {
        int[] nums = {1,1,2,5,2,1,0,0,1,3};

        System.out.println(canJump(nums));
    }

    private static boolean canJump(int[] nums) {
        int finalPosition = nums.length - 1;
        for(int idx = nums.length -2; idx >= 0; idx--) {
            if(idx + nums[idx] >= finalPosition) {
                finalPosition = idx;
            }
        }

        return finalPosition == 0;
    }
}
