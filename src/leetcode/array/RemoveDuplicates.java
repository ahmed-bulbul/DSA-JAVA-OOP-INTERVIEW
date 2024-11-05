package leetcode.array;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};

        int i = 0;
        for (int e : nums) {
            if (i == 0 || i == 1 || nums[i - 2] != e) {
                nums[i] = e;
                i++;
            }
        }

        for(int e : nums){
            System.out.print(e+" ");
        }

    }
}
