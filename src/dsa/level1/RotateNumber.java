package dsa.level1;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp = n;
        int node =0;
        while(temp >0){
            temp = temp/10;
            node++;
        }

        k = k % node;

        int div = 1;
        int mult = 1;
        for(int i=1;i<=node;i++){
            if(i <=k){
                div = div * 10;
            }else{
                mult = mult * 10;
            }
        }

        int q = n/div;
        int r = n % div;
        int res = r * mult + q;
        System.out.println(res);


    }
}
