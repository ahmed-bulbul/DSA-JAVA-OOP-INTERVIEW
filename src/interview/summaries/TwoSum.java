package interview.summaries;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> countMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target -nums[i];
            if(countMap.containsKey(complement)){
                return new int[] {countMap.get(complement),i};
            }else{
                countMap.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
