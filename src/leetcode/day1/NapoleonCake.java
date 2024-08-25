package leetcode.day1;
import java.util.Scanner;

public class NapoleonCake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] cream = new int[n];
            for (int i = 0; i < n; i++) {
                cream[i] = scanner.nextInt();
            }

            int[] result = new int[n];
            int creamLeft = 0;

            // Traverse from the top layer to the bottom
            for (int i = n - 1; i >= 0; i--) {
                creamLeft = Math.max(creamLeft, cream[i]);
                if (creamLeft > 0) {
                    result[i] = 1;
                    creamLeft--;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
