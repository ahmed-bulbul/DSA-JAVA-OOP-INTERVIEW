package dsa.level1;

import java.util.Scanner;

public class CountDigit {

    public static void main(String[] args) {
//        int n = 354;
//        int digit = 0;
//        while(n!=0){
//            int mod = n % 10;
//            System.out.println(mod);
//            n = n/10;
//            digit++;
//        }
//
//        System.out.println(digit);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //754
        int node = 0;
        int temp = n;
        while (temp!=0){
             temp = temp/10;
             node++;
        }

        int div = (int) Math.pow(10,node-1);

        while (div!=0){
            int q = n/div;
            System.out.println(q);
            n = n % div;
            div = div/10;
        }
    }
}
