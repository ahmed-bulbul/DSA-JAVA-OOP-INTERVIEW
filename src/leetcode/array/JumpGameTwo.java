package leetcode.array;

public class JumpGameTwo {
    public static void main(String[] args) {

        int[] nums = {2,4,1,2,3,1,1,2};
        System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {
        int totalJumps = 0;
        int destination = nums.length - 1;
        int coverage = 0,lastJumpIdx = 0;

        //Base case
        if(nums.length == 1) return 0;

        for(int i = 0; i < nums.length - 1; i++){
            coverage = Math.max(coverage, i + nums[i]);
            if(i == lastJumpIdx){
                totalJumps++;
                lastJumpIdx = coverage;

                //check if we have reached destination
                if(coverage >= destination) return totalJumps;
            }
        }

        return totalJumps;

    }
}
