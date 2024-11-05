package dsa.lcd.array;

import java.util.Arrays;

public class prob25FindMaxProduct2Integer {
    public static void main(String[] args) {
        int[] nums = {1, 20, -1, -30};
        // Initialize two largest and two smallest values
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            // Update two largest values
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            // Update two smallest values
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // Maximum product will be the max of (max1 * max2) or (min1 * min2)
        int sum =  Math.max(max1 * max2, min1 * min2);

        System.out.println(sum);
    }
}
