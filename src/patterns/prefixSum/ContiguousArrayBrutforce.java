package patterns.prefixSum;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArrayBrutforce {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0,1};
        System.out.println(findMaxLength(nums));
    }

    public static int  findMaxLength (int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int zeros = 0;
            int ones = 0;

            for(int j=i;j<nums.length;j++){
                if(nums[j] == 0){
                    zeros++;
                }else{
                    ones++;
                }
                if(zeros == ones){
                    ans = Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }

    public static int findMaxLengthOptimized(int[] nums) {
        int n = nums.length;

        for(int i = 0; i<n; i++){
            if(nums[i] == 0)
                nums[i]=-1;
        }

        Map<Integer,Integer> map = new HashMap<>();

        int sum = 0;
        int ans = 0;
        for(int i = 0; i<n; i++){
            sum+=nums[i];

            if(sum == 0) ans = i+1;

            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                ans = Math.max(len,ans);
            }
            else
                map.put(sum,i);
        }

        return ans;
    }
}
