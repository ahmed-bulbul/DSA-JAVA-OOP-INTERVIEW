package interview;

import static java.lang.System.out;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] numbers = {-2,-5,6,-2,-3,1,5,-6};
        out.println(maxSubArray(numbers));
    }

    private static int maxSubArray(int[] nums) {

        int curr_max = nums[0];
        int max_so_far = nums[0];

        for(int i=1;i<nums.length;i++){
            curr_max = Math.max(nums[i],nums[i] + curr_max);
            max_so_far = Math.max(curr_max,max_so_far);
        }
        return max_so_far;

    }
}
