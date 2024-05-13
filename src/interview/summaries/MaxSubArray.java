package interview.summaries;

import static java.lang.System.out;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] numbers = {-2,-5,6,-2,-3,1,5,-6};
        out.println(maxSubArray(numbers));
    }

    private static int maxSubArray(int[] numbers) {

        int curr_max = numbers[0];
        int max_so_far = numbers[0];

        for(int i=1;i<numbers.length;i++){
            curr_max = Math.max(numbers[i],numbers[i]+curr_max);
            max_so_far = Math.max(curr_max,max_so_far);
        }
        return max_so_far;

    }
}
