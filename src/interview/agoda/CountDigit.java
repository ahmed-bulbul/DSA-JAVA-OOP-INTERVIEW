package interview.agoda;

import java.util.Scanner;

public class CountDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        if(n <0){
            n = n * -1;
        }else if(n==0){
            n =1;
        }

        while (n > 0){
            n = n/10;
            count++;
        }

        System.out.println(count);
    }
}
