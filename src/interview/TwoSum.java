package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // 2

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i]; //7 2
            if (map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
