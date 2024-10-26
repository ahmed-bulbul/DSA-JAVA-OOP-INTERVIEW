package lcd.array;

public class prob6ArrayinAlternatePosition {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
