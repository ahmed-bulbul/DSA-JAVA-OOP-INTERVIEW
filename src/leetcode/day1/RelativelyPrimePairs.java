package leetcode.day1;

import java.util.Scanner;

public class RelativelyPrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long l = scanner.nextLong();
        long r = scanner.nextLong();
        scanner.close();

        if ((r - l + 1) % 2 != 0) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
        for (long i = l; i <= r; i += 2) {
            System.out.println(i + " " + (i + 1));
        }
    }
}
