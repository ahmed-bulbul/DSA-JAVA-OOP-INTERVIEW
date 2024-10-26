package lcd.array;

public class prob7FindSecondLargestElm {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int firstMax = arr[0];
        int secondMax = Integer.MIN_VALUE;;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }else if(arr[i] <= firstMax && arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No distinct second largest element.");
        } else {
            System.out.println("Second largest element is: " + secondMax);
        }
    }
}
