package dsa.lcd.array;

public class prob11FindLargestContigiousSum {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int max_so_far = arr[0];
        int curr_max = arr[0];

        for(int i=1;i<arr.length;i++){
            curr_max = Math.max(arr[i],arr[i] + curr_max);
            max_so_far = Math.max(curr_max,max_so_far);
        }

        System.out.println(max_so_far);

    }
}
