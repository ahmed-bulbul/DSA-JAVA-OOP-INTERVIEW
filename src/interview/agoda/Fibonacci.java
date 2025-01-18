package interview.agoda;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();

        int first = 0,second = 1, next;

        for(int i = 0;i<n;i++){
            System.out.println(first +" ");
            next = first + second;
            first = second;
            second = next;
        }


    }
}
